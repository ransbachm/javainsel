package com.insel.chapter5;

public class MusicDisc {
	
	{
		NUMBER_OF_DISCS++;
	}
	
	MusicDisc() {
		title = "No title";
		artist = "No artist";
		releaseDate = new java.util.Date(0);
	}
	MusicDisc(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}
	
	
	private String title;
	private String artist;
	private java.util.Date releaseDate;
	private static int NUMBER_OF_DISCS = 0;
	
	
	static int getNumberOfDiscs() {
		return NUMBER_OF_DISCS;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getReleaseDate() {
		return String.format("%d", releaseDate);
	}
	public void setReleaseDate(java.util.Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	@Override public String toString() {
		return artist + " - " + title;
	}
	
	

}
