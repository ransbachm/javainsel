package com.insel.chapter23;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;

public class VCardCreatorV1 {
	
	public static void main(String [] args) throws IOException {
		new VCardCreatorV1("Defqwop", "https://soundcloud.com/defqwop").export("C:\\users\\ransb\\desktop\\experiments\\Defqwop.vcf");
	}
	
	private String formattedName;
	private String soundcloud;

	public VCardCreatorV1(String formattedName, String soundcloud) {
		this.formattedName = formattedName;
		this.soundcloud = soundcloud;
	}
	
	public void export(String filename) throws IOException {
		StringBuilder sb = new StringBuilder();
		sb.append("BEGIN:VCARD\n");
		if(formattedName!=null && !formattedName.isEmpty()) {
			sb.append("FN:").append(formattedName).append("\n");
		}
		if(soundcloud!=null && !soundcloud.isEmpty()) {
			sb.append("URL:").append(soundcloud).append("\n");
		}
		sb.append("END:VCARD");
		Files.write(Paths.get(filename), Collections.singleton(sb));
	}
}
