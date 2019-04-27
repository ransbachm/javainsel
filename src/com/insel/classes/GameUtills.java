package com.insel.classes;

class GameUtills {
	
	public static final int MAX_PLAYER_NAME_LEN = 40;
	
	public static boolean isPlayerNameSuitable(String name) {
		
		if(name == null) {
			return false;
		}
		
		return (name.length() <= MAX_PLAYER_NAME_LEN && name.matches("\\w+"));
		
	}
}
