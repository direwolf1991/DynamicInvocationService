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
private String tempFileFolder;  //临时文件存放目录
private String fileFolder;  //存文件的目录
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
this.doPost(request, response);
}
public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
//step 1 将上传文件流写入到临时文件
File tempFile = getTempFile();
writeToTempFile(request.getInputStream(), tempFile);
//step 2从临时文件中取得上传文件流
RandomAccessFile randomFile = new RandomAccessFile(tempFile, "r");
//step 3取得文件名称
String filename = getFileName(randomFile);
//step 4检查存放文件的目录在不在
checkFold();
//step 5保存文件
long fileSize = saveFile(randomFile, filename);
//step 6关闭流对像,删除临时文件
randomFile.close();
tempFile.delete();
}
public void init() throws ServletException {
//获取项目所在目录
String contentPath = getServletContext().getRealPath("/");
//this.tempFileFolder = contentPath + "files/_tmp";
//this.fileFolder = contentPath+"files/_file";
	//this.tempFileFolder="C:\\servicesUpload\\_file";
	//this.fileFolder="C:\\servicesUpload\\";
	this.tempFileFolder = contentPath + "files/_tmp";
	this.fileFolder = contentPath+"files";
}
/**
* 对字符串进行转码
* @param str
* @return 转码后的字符串
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
* 产生临时文件对象
* 会检查临时目录是否存在，如果不存在将创建目录
* @return 临时文件对象
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
* 将上传的数据流存入临时文件
* @param fileSourcel 上传流
* @param tempFile        临时文件
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
* 从临时文件流中提取文件名称
* @param randomFile
* @return 解析的文件名称
* @throws IOException
*/
/* 获取上传文件的开始位置
* 开始位置会因为from 表单的参数不同而不同
* 如果from表单只上传文件是从第四行开始
* 本例from表单还有一个title的input ， 所以从第八行开始。每多一个参数就加四行。
* @param randomFile
* @return 上传文件的开始位置
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
* 获取上传文件的结束位置
* 结束位置会因为文件类型不同，而不同
* 压缩包是倒数第二行后
* @param randomFile
* @return 文件的结束位置
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
* 检查要保存文件的文件夹是否存在
*/
private void checkFold(){
File file = new File(this.fileFolder);
if (!file.exists()){
file.mkdirs();
}
}
/**
* 将临时文件解析后存放到指定的文件存放目录
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
//从上传文件数据的开始位置到结束位置，把数据写入到要保存的文件中
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
