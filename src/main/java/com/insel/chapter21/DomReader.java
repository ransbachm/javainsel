package com.insel.chapter21;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomReader {

	public static void main(String[] args) throws ParserConfigurationException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		try(InputStream in = DomReader.class.getResourceAsStream("OSU.xml")) {
			Document doc = builder.parse(in);
			Element root = doc.getDocumentElement();
			Node beatmapObject = root.getElementsByTagName("beatmaps").item(0);
			NodeList beatmaps = ((Element) beatmapObject).getElementsByTagName("beatmap");
			for(int i=0; i<beatmaps.getLength(); i++) {
				Node crr = beatmaps.item(i);
				System.out.println(crr.getAttributes().getNamedItem("name").getTextContent());
				// Safety catch 
				for(int j=0; j<1000; j++) {
					if(j>=999) {
						throw new RuntimeException("Should not happen");
					}
					Node attr = crr.getAttributes().item(j);
					if(attr == null) {
						break;
					}
					System.out.println(attr.getTextContent());
				}
				System.out.println();
			}
			
		} catch(org.xml.sax.SAXException e) {
			e.printStackTrace();
		}
	}

}
