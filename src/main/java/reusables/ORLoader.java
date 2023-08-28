package reusables;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class ORLoader {
	
	public static HashMap <String,Document> ORDoc = new HashMap<String,Document>();
	
	public static void LoadOR(String ORPath)
	{
		String []ORPaths = ORPath.split(";");
		 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		 try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			for(int i=0;i<=ORPaths.length-1;i++)
			{
			  File fl = new File(ORPaths[i]);
			  Document d = db.parse(fl);
			  String appName = d.getFirstChild().getNodeName();
			  if(appName.equalsIgnoreCase("Application"))
			  {
				 String appValue= d.getFirstChild().getAttributes().getNamedItem("name").getNodeValue();
				 ORDoc.put(appValue, d);
			  }
			 
			
			}
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
