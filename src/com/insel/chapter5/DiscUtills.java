package com.insel.chapter5;


//This should not be used, its just to test static functions
public class DiscUtills {
	private DiscUtills() {
		
	}
	
	public static String DiscToString(MusicDisc d) {
		return "#|>" + d.getArtist() + " - " + d.getTitle() + "<|#";
	}
}
