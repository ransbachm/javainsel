package com.insel.chapter6.game;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class Cool {
	public static void main(String [] args) {
		//TODO Check if should be removed
		LinkedList<String> l = new LinkedList<String>();
		
		String regex = "(?:.+?)?(?:\\/v\\/|watch\\/|\\?v=|\\&v=|youtu\\.be\\/|\\/v=|^youtu\\.be\\/)([a-zA-Z0-9_-]{11})+";
		String ytLink = "https://youtu.be/2BMf2GCLVNo";
		String notYtLink = "ghasda Dasd ist nit ein Satz :://asd y youtube";
		PrintStream o = System.out;
		
		Scanner scanner = null;
		
		FileWriter fW = null;
		
		File file = new File("C:\\WAC.txt");
		try {
			boolean nF = new File("C:\\" + file.getName() + "EXTRACTED").createNewFile();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		try {
			fW = new FileWriter("C:\\" + file.getName() + "EXTRACTED");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		

		try {
			scanner = new Scanner(file, "UTF-8");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		if(scanner != null) {
			
			while(scanner.hasNext()) {
				l.add(scanner.nextLine());
			}
			
			for(int i=0; i<l.size(); i++) {
				String cr = l.get(i);
				if(cr.matches(regex) ) {
					String fS = cr.substring(cr.indexOf("https://"), cr.length());
					o.println(fS);
					try {
						fW.write(fS);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
			
		}
		try {
			fW.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
