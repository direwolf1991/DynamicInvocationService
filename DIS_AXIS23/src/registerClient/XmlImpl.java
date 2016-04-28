package registerClient;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
public class XmlImpl implements XmlInterface{

	 private Document document;
	 public void init() {
	        try {
	            DocumentBuilderFactory factory = DocumentBuilderFactory
	                    .newInstance();
	            DocumentBuilder builder = factory.newDocumentBuilder();
	            this.document = builder.newDocument();
	        } catch (ParserConfigurationException e) {
	            System.out.println(e.getMessage());
	        }
	    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		 XmlImpl dd=new XmlImpl();
//	        String str="D:/Services.xml";
//	        dd.init();
//	        dd.createXml(str);    //创建xml
//	        dd.parserXml(str);    //读取xml
//	}


	public void createXml(String fileName) {
		// TODO Auto-generated method stub
			Element root = this.document.createElement("services"); 
	        this.document.appendChild(root); 
	        Element service = this.document.createElement("service"); 
	        Element serviceId = this.document.createElement("serviceId"); 
	        serviceId.appendChild(this.document.createTextNode("1")); 
	        service.appendChild(serviceId); 
	        Element sevviceName = this.document.createElement("serviceName"); 
	        sevviceName.appendChild(this.document.createTextNode("Sum")); 
	        service.appendChild(sevviceName); 
	        Element serviceVersion = this.document.createElement("serviceVersion"); 
	        serviceVersion.appendChild(this.document.createTextNode("1.0")); 
	        service.appendChild(serviceVersion); 
	        Element serviceDescription = this.document.createElement("serviceDescription");
	        serviceDescription.appendChild(this.document.createTextNode("serviceDescription"));
	        service.appendChild(serviceDescription);
	        Element SystemReq = this.document.createElement("SystemReq");
	     //   SystemReq.appendChild(this.document.createTextNode("SystemReqirements"));
	        Element OS = this.document.createElement("OS");
	        OS.appendChild(this.document.createTextNode("Windows"));
	        SystemReq.appendChild(OS);
	        Element CPUNumber = this.document.createElement("CPUNumber");
	        CPUNumber.appendChild(this.document.createTextNode("2"));
	        SystemReq.appendChild(CPUNumber);
	        Element memory = this.document.createElement("memory");
	        memory.appendChild(this.document.createTextNode("500M"));
	        SystemReq.appendChild(memory);
	        Element disk = this.document.createElement("disk");
	        disk.appendChild(this.document.createTextNode("80G"));
	        SystemReq.appendChild(disk);
	        
	        service.appendChild(SystemReq);
	        root.appendChild(service); 
	        TransformerFactory tf = TransformerFactory.newInstance();
	        try {
	            Transformer transformer = tf.newTransformer();
	            DOMSource source = new DOMSource(document);
	            transformer.setOutputProperty(OutputKeys.ENCODING, "gb2312");
	            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	            PrintWriter pw = new PrintWriter(new FileOutputStream(fileName));
	            StreamResult result = new StreamResult(pw);
	            transformer.transform(source, result);
	            System.out.println("生成XML文件成功!");
	        } catch (TransformerConfigurationException e) {
	            System.out.println(e.getMessage());
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage());
	        } catch (FileNotFoundException e) {
	            System.out.println(e.getMessage());
	        } catch (TransformerException e) {
	            System.out.println(e.getMessage());
	        }
	}


	public void parserXml(String fileName) {
		// TODO Auto-generated method stub
		 try {
	            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	            DocumentBuilder db = dbf.newDocumentBuilder();
	            Document document = db.parse(fileName);
	             
	            NodeList services = document.getChildNodes();
	           
	            for (int i = 0; i < services.getLength(); i++) {
	                Node service = services.item(i);
	                NodeList serviceInfo = service.getChildNodes();
	               
	                for (int j = 1; j < serviceInfo.getLength(); j+=2) {
	                    Node node = serviceInfo.item(j);
	                    NodeList serviceMeta = node.getChildNodes();
	                   
	                    for (int k = 1; k < serviceMeta.getLength()-2; k+=2) {
	                        System.out.println(serviceMeta.item(k).getNodeName()
	                                + ":" + serviceMeta.item(k).getTextContent());
	                    }
	                    Node Sys = serviceMeta.item(serviceMeta.getLength()-2);
	                    NodeList Syslist = Sys.getChildNodes();
	                    System.out.println(Sys.getNodeName());
	                    for(int m=1;m<Syslist.getLength();m+=2)
	                    {
	                    	 System.out.println(Syslist.item(m).getNodeName()
		                                + ":" + Syslist.item(m).getTextContent());
	                    }
	                }
	            }
	            System.out.println("解析完毕");
	        } catch (FileNotFoundException e) {
	            System.out.println(e.getMessage());
	        } catch (ParserConfigurationException e) {
	            System.out.println(e.getMessage());
	        } catch (SAXException e) {
	            System.out.println(e.getMessage());
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	}

}
