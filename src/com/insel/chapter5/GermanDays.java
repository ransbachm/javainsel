package com.insel.chapter5;

public class GermanDays {
	
	private GermanDays() {	
	}
	
	enum GWeekdays {
		MONTAG,DIENSTAG,MITTWOCH,DONNERSTAG,FREITAG,SAMSTAG,SONNTAG
	}
	
	public static String getDay(GWeekdays g) {
			return g.toString();
		
			
	}

}
