package registerClient;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Upload extends HttpServlet {
private static final long serialVersionUID = 1L;
private static final Random RANDOM = new Random();
private String tempFileFolder;  //��ʱ�ļ����Ŀ¼
private String fileFolder;  //���ļ���Ŀ¼
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
this.doPost(request, response);
}
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
//step 1 ���ϴ��ļ���д�뵽��ʱ�ļ�
File tempFile = getTempFile();
writeToTempFile(request.getInputStream(), tempFile);
//step 2����ʱ�ļ���ȡ���ϴ��ļ���
RandomAccessFile randomFile = new RandomAccessFile(tempFile, "r");
//step 3ȡ���ļ�����
String filename = getFileName(randomFile);
//step 4������ļ���Ŀ¼�ڲ���
checkFold();
//step 5�����ļ�
long fileSize = saveFile(randomFile, filename);
//step 6�ر�������,ɾ����ʱ�ļ�
randomFile.close();
tempFile.delete();
}
public void init() throws ServletException {
//��ȡ��Ŀ����Ŀ¼
String contentPath = getServletContext().getRealPath("/");
//this.tempFileFolder = contentPath + "files/_tmp";
//this.fileFolder = contentPath+"files/_file";
	//this.tempFileFolder="C:\\servicesUpload\\_file";
	//this.fileFolder="C:\\servicesUpload\\";
	this.tempFileFolder = contentPath + "files/_tmp";
	this.fileFolder = contentPath+"files";
}
/**
* ���ַ�������ת��
* @param str
* @return ת�����ַ���
*/
private String codeString(String str) {
String s = str;
try {
byte[] temp = s.getBytes("ISO-8859-1");
s = new String(temp, "UTF-8");
return s;
} catch (UnsupportedEncodingException e) {
e.printStackTrace();
return s;
}
}
/**
* ������ʱ�ļ�����
* ������ʱĿ¼�Ƿ���ڣ���������ڽ�����Ŀ¼
* @return ��ʱ�ļ�����
* @throws IOException
*/
private File getTempFile()throws IOException{
File tempFolder = new File(this.tempFileFolder);
if (!tempFolder.exists()){
tempFolder.mkdirs();
}
String tempFileName = this.tempFileFolder+File.separator+Math.abs(RANDOM.nextInt());
File tempFile = new File(tempFileName);
if (!tempFile.exists()){
tempFile.createNewFile();
}
return tempFile;
}
/**
* ���ϴ���������������ʱ�ļ�
* @param fileSourcel �ϴ���
* @param tempFile        ��ʱ�ļ�
* @throws IOException
*/
private void writeToTempFile(InputStream fileSourcel,File tempFile)throws IOException{
FileOutputStream outputStream = new FileOutputStream(tempFile);
byte b[] = new byte[1000];
int n ;
while ((n=fileSourcel.read(b))!=-1){
outputStream.write(b,0,n);
}
outputStream.close();
fileSourcel.close();
}
private String getFileName(RandomAccessFile randomFile)throws IOException
{
	String _line;
	while((_line=randomFile.readLine())!=null && !_line.contains("form-data; name=\"upload\""))
	{
	}
	String filePath = _line;
	String filename = filePath.replace("Content-Disposition: form-data; name=\"upload\"; filename=\"", "").replace("\"","");
	filename=codeString(filename);
	randomFile.seek(0);
	return filename;
	}
/**
* ����ʱ�ļ�������ȡ�ļ�����
* @param randomFile
* @return �������ļ�����
* @throws IOException
*/
/* ��ȡ�ϴ��ļ��Ŀ�ʼλ��
* ��ʼλ�û���Ϊfrom ���Ĳ�����ͬ����ͬ
* ���from��ֻ�ϴ��ļ��Ǵӵ����п�ʼ
* ����from������һ��title��input �� ���Դӵڰ��п�ʼ��ÿ��һ�������ͼ����С�
* @param randomFile
* @return �ϴ��ļ��Ŀ�ʼλ��
* @throws IOException
*/
private long getFileEnterPosition(RandomAccessFile randomFile)throws IOException{
long  enterPosition = 0;
int forth = 1;
int n ;
while((n=randomFile.readByte())!=-1&&(forth<=8)){
if(n=='\n'){
enterPosition = randomFile.getFilePointer();
forth++;
}
}
return enterPosition;
}
/**
* ��ȡ�ϴ��ļ��Ľ���λ��
* ����λ�û���Ϊ�ļ����Ͳ�ͬ������ͬ
* ѹ�����ǵ����ڶ��к�
* @param randomFile
* @return �ļ��Ľ���λ��
* @throws IOException
*/
private long getFileEndPosition(RandomAccessFile randomFile)throws IOException{
randomFile.seek(randomFile.length());
long endPosition = randomFile.getFilePointer();
int j = 1;
while((endPosition>=0)&&(j<=2)){
endPosition--;
randomFile.seek(endPosition);
if(randomFile.readByte()=='\n'){
j++;
}
}
return endPosition;
}
/**
* ���Ҫ�����ļ����ļ����Ƿ����
*/
private void checkFold(){
File file = new File(this.fileFolder);
if (!file.exists()){
file.mkdirs();
}
}
/**
* ����ʱ�ļ��������ŵ�ָ�����ļ����Ŀ¼
* @param randomFile
* @param forthEnterPosition
* @param filename
* @return fileSize
* @throws IOException
*/
private long saveFile(RandomAccessFile randomFile,String filename)throws IOException{
File saveFile = new File(this.fileFolder,filename);
RandomAccessFile randomAccessFile = new RandomAccessFile(saveFile,"rw");
long forthEnterPosition = getFileEnterPosition(randomFile);
long endPosition = getFileEndPosition(randomFile);
//���ϴ��ļ����ݵĿ�ʼλ�õ�����λ�ã�������д�뵽Ҫ������ļ���
randomFile.seek(forthEnterPosition);
long startPoint = randomFile.getFilePointer();
while(startPoint<endPosition){
randomAccessFile.write(randomFile.readByte());
startPoint = randomFile.getFilePointer();
}
long fileSize = randomAccessFile.length();
randomAccessFile.close();
return fileSize;
}
}
