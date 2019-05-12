package com.insel.chapter6.game;

public class Door extends GameObject{
	int id;
	boolean isOpen;
	
	public Door (int id) {this.id = id;}
	
	@Override public boolean useOn(GameObject o) {
		return false;
	}

}
