package com.insel.chapter21;

import java.io.IOException;
import java.io.Writer;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

import javax.xml.bind.JAXB;

public class XmlCreator {
	public static void main(String [] args) throws URISyntaxException {
		User user = new User();
		User user2 = new User();
		/* 
		 * NOTE: 'wealth' is NOT set on user2 and will be left null
		 * It will NOT be set for user2  in the final xml file
		 */ 
		user.setAge(16);
		user2.setAge(-1); // Donno.
		user.setName("Angelise Ikaruga Misurugi");
		user2.setName("Tusk");
		user.setWealth(Integer.MAX_VALUE);
		JAXB.marshal(user, System.out);
		
		UserDatabase db = new UserDatabase();
		db.setUsers(Arrays.asList(user, user2));
		Path path = Paths.get("C:\\users\\ransb\\desktop\\Experiments\\createdXml.xml");
		try(Writer out = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
			JAXB.marshal(db, out);
			
			UserDatabase db2 = JAXB.unmarshal(path.toFile(), UserDatabase.class);
			System.out.println("\n" + db2.getUsers().get(0).getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
