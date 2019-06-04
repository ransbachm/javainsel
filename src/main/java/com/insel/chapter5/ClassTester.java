package com.insel.chapter5;

import java.io.*;

public class ClassTester {

	public static void main(String[] args) {
		
		Player player = new Player();
		
		
		
		MusicDisc d1 = new MusicDisc();
		MusicDisc d2 = new MusicDisc("Darude", "Sandstorm");
		MusicDisc d3 = new MusicDisc("Norma", "Brain Power");
		
		InitaialTester t = new InitaialTester();
		InitaialTester t2 = new InitaialTester();
		
		PrintStream o = System.out;
		
		String name = "ProGamerNotHD";
		
		if(GameUtills.isPlayerNameSuitable(name)) {
			player.setName(name);
		}
		
		
		player.setItem("Pickaxe");
		
		
		o.printf("Spieler %s hat das Item %s in der Hand! %n", player.getName(), player.getItem());
		o.printf("Tree wurde %d mal konstruiert. %n", Tree.getNumOfInstances());
		o.printf("Disc d1: %s%n", d1.toString());
		o.printf("Disc d2: %s%n", d2.toString());
		o.printf("Disc d3 via DiscUtills: %s%n", DiscUtills.DiscToString(d3));
		o.printf("Heute ist (warscheinlich nicht) %s !", 
				GermanDays.getDay(GermanDays.GWeekdays.DIENSTAG).toLowerCase()); //Bad
		
		
		
		
		
	}

}
