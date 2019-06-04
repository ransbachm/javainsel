package com.insel.chapter6;

public class GameObject {
	String name;
	
	@SuppressWarnings("unused")
	private GameObject() {}
	
	GameObject(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override public String toString() {
		return name;
	}
	
	

}
