package registerClient;
import java.io.*;
import java.net.*;


public class FileClient {	
	public boolean start (String vmIP, String filePath, boolean isAxisService) throws IOException {
    	
        int SocketFileReceiver_port = 8821;
        Socket clientSocket = null;
        boolean result = true; 
        System.out.println("建立socket连接");
    	try {
            clientSocket = new Socket(vmIP, SocketFileReceiver_port);
            System.out.println("建立socket连接成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("建立socket连接失败");
            result = false;
        } finally {
        }
        try {   
            System.out.println("FileClient get filePath:" + filePath);
            File fi = new File(filePath);
            System.out.println("file.length:" + (int) fi.length());

            DataInputStream fis = new DataInputStream(new BufferedInputStream(new FileInputStream(filePath)));
            DataOutputStream ps = new DataOutputStream(clientSocket.getOutputStream());
            ps.writeBoolean(isAxisService);
            ps.flush();
            ps.writeUTF(fi.getName());
            ps.flush();
            ps.writeLong((long) fi.length());
            ps.flush();
            int bufferSize = 8192;
            byte[] buf = new byte[bufferSize];

            while (true) {
                int read = 0;
                if (fis != null) {
                    read = fis.read(buf);
                }
                if (read == -1) {
                    break;
                }
                ps.write(buf, 0, read);
            }
            ps.flush();           
            fis.close();
            clientSocket.close();                
            System.out.println("file send success in FileClient");
        } catch (Exception e) {
        	e.printStackTrace();
        	result = false;
        }
        return result;
    }
}

