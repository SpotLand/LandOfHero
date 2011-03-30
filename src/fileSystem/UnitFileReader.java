/**
 * get data from file, not through precisely thought yet. date 2-25
 * @author qi
 */

package fileSystem;

import java.io.File;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class UnitFileReader implements FileSystemInterface{
	
	private String filename;
	private File inputXml;
	private SAXReader saxReader;

	public UnitFileReader() {
		filename = "unit description.xml";
		inputXml = new File(filename);
		saxReader = new SAXReader();
	}

	@Override
	public String get(String raceName, String categoryName, String attributeName) throws NullPointerException {		
		// TODO Auto-generated method stub
		try {   
			Document document = saxReader.read(inputXml);
			Element root = document.getRootElement();
			Element race = findElement(root, raceName);
			if(race == null)
				throw new NullPointerException("no such attribute: " + raceName);
			
			Element category = findElement(race, categoryName);
			if(category == null)
				throw new NullPointerException("no such attribute: " + categoryName);
			
			Element attribute = findElement(category, attributeName);
			if(attribute == null)
				throw new NullPointerException("no such attribute: " + attributeName);
			
			return attribute.getText();
			
		} catch (DocumentException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	private Element findElement(Element root, String raceName) {
		Element race = null;
		Iterator findRace = root.elementIterator();			
		while( findRace.hasNext() ) {
			 race = (Element) findRace.next();
			 
			 if(race.getName().equals((String)raceName)) {
				 break;
			 }
		}
		
		return race;
	}

}
