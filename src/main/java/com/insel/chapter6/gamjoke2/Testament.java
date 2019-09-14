package com.insel.chapter6.gamjoke2;

public enum Testament {
	SISTER();
	
	class Devil {
		@Override public String toString() {
			return String.format("[%s%nUse your powers for the good!]%n", super.toString());
		}
	}
}
