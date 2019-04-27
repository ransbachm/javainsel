

package com.insel.strings;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;




public class scannerTest {

	public static void main(String[] args) throws IOException {
		
		try(Scanner scanner = new Scanner(Paths.get("C:\\jFolder\\hentai.txt"), 
				StandardCharsets.UTF_8.name())) {
			
			while(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		}
		

	}

}
