package com.insel.chapter6.game;

public class Key extends GameObject{
	
	int id;
	public Key(int id) {this.id = id;}
	
	@Override public boolean useOn(GameObject o) {
		
		if(o instanceof Door) {
			if(id == ((Door) o).id) {
				return ((Door) o).isOpen = true;
			}
		}
		return false;
		
	}

}
