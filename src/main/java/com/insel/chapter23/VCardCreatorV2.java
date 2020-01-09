package com.insel.chapter23;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class VCardCreatorV2 {
	
	public static void main(String [] args) throws IOException {
		new VCardCreatorV2("NOMA", "").export("C:\\users\\ransb\\desktop\\experiments\\NOMA.vcf");
	}
	
	private String formattedName;
	private String soundcloud;

	public VCardCreatorV2(String formattedName, String soundcloud) {
		this.formattedName = formattedName;
		this.soundcloud = soundcloud;
	}
	
	public void export(Writer out) throws IOException {
		out.write(toString());
	}
	
	public void export(String filename) throws IOException {
		try(Writer writer = Files.newBufferedWriter(Paths.get(filename))) {
			export(writer);
		}
	}
	
	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("BEGIN:VCARD\n");
		if(formattedName!=null && !formattedName.isEmpty()) {
			sb.append("FN:").append(formattedName).append("\n");
		}
		if(soundcloud!=null && !soundcloud.isEmpty()) {
			sb.append("URL:").append(soundcloud).append("\n");
		}
		sb.append("END:VCARD");
		return sb.toString();
	}
}
