package com.insel.chapter21;

import java.nio.file.Paths;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.util.JAXBSource;

public class CopyAnything {
	public static void main(String [] args) throws JAXBException {
		// Get an object to clone
		UserDatabase db = JAXB.unmarshal(Paths.get("C:\\users\\ransb\\desktop\\Experiments\\createdXml.xml").toFile(), UserDatabase.class);
		
		// Setup context and source
		JAXBContext con = JAXBContext.newInstance(UserDatabase.class);
		Unmarshaller un = con.createUnmarshaller();
		JAXBSource s = new JAXBSource(con, db);
		
		// Clone the object
		UserDatabase copyDb = (UserDatabase) un.unmarshal(s);
		
		// Output content
		db.getUsers().forEach(e -> System.out.printf("%s %s %s%n", e.getName(), e.getAge(), e.getWealth()));
		copyDb.getUsers().forEach(e -> System.out.printf("%s %s %s%n", e.getName(), e.getAge(), e.getWealth()));
	}
	
}