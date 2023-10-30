package reusables;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.openqa.selenium.By;
import org.w3c.dom.Document;
import org.w3c.dom.Node;




public class xmlParser {
	
	public static PageObject pg = new PageObject();	
	
	

	public static By LoadOR(String Logicalname) {
		// TODO Auto-generated method stub
		
	//	pgeObjct.setName("SignIn");
			XPath xp = XPathFactory.newInstance().newXPath();
			Node nl= null;
			By byObj = null;
			try {
				
				String xpathLocator ="//Page[@name=\"pageValue\"]//*[@name=\"elementValue\"]";				
				String xpathLocator1=xpathLocator.replace("pageValue", pg.getName()).replaceAll("elementValue", Logicalname);
				Document d =ORLoader.ORDoc.get("magneto");
				System.out.println(d.getFirstChild().getNodeName());
				nl = (Node)xp.compile(xpathLocator1).evaluate(d, XPathConstants.NODE);
				System.out.println(nl.getAttributes().getNamedItem("name").getNodeValue());
				String LocType=nl.getAttributes().getNamedItem("type").getNodeValue();
				String LocValue=nl.getAttributes().getNamedItem("locator").getNodeValue();
							
				byObj = getByLocator(LocType ,LocValue);
				
				
			} catch (XPathExpressionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return byObj;			
		
	}
	
	public static By getByLocator(String LocType ,String LocValue)
	{
		By Locator =null;
		switch (LocType.toLowerCase())
		{
			case "id":
				Locator = By.id(LocValue);
				break;
				
			case "name":
				Locator = By.name(LocValue);
				break;
				
			case "tagname":
				Locator = By.tagName(LocValue);
				break;
				
			case "linktext":
				Locator = By.linkText(LocValue);
				break;
				
			case "partiallinktext":
				Locator = By.partialLinkText(LocValue);
				break;
				
			case "xpath":
				Locator = By.xpath(LocValue);
				break;
				
			case "cssselector":
				Locator = By.cssSelector(LocValue);
				break;
		}
		return Locator;
		
	}
	
	
	public static boolean updateXmlOR(String fldName,String fldValue)
	{
		XPath xp = XPathFactory.newInstance().newXPath();
		Node nl= null;
		By byObj = null;
		try {
			
			String xpathLocator ="//Page[@name=\"pageValue\"]//*[@name=\"elementValue\"]";				
			String xpathLocator1=xpathLocator.replace("pageValue", pg.getName()).replaceAll("elementValue", fldName);
			Document d =ORLoader.ORDoc.get("magneto");
			System.out.println(d.getFirstChild().getNodeName());
			nl = (Node)xp.compile(xpathLocator1).evaluate(d, XPathConstants.NODE);
			
			System.out.println(nl.getAttributes().getNamedItem("name").getNodeValue());
			
			String Loct=nl.getAttributes().getNamedItem("locator").getNodeValue();
			Loct=Loct.replaceFirst("itemvalue",fldValue );
			
			nl.getAttributes().getNamedItem("locator").setNodeValue(Loct);
			System.out.println(nl.getAttributes().getNamedItem("locator").getNodeValue());
						
			
			
		} catch (XPathExpressionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
				
	
	}

}
