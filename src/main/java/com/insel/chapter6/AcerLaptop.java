package com.insel.chapter6;

public class AcerLaptop extends Laptop {
	
	@Override AcerLaptop getThis() { 
		//Seite 477 weil Unterryp wird die Methode �berschrieben
		return this;
	}

}
