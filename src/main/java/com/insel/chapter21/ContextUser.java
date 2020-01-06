package com.insel.chapter21;

import java.nio.file.Path;
import java.nio.file.Paths;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ContextUser {
	public static void main(String [] args) throws JAXBException {
		Path path = Paths.get("C:\\users\\ransb\\desktop\\Experiments\\createdXml.xml");
		JAXBContext con = JAXBContext.newInstance(UserDatabase.class);
		Unmarshaller um = con.createUnmarshaller();
		UserDatabase db = (UserDatabase) um.unmarshal(path.toFile());
		db.getUsers().stream().forEach(e -> System.out.printf("%s %s %s%n" , e.getName(), e.getAge(), e.getWealth()));
	}
}
