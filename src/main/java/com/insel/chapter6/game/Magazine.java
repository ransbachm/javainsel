package com.insel.chapter6.game;

public class Magazine extends GameObject implements Buyable {
	
	Magazine() {}
	Magazine(double price) {this.price = price;}
	
	double price = 0.69d;
	@Override
	public double price() {return this.price;}
	
	@Override
	public boolean useOn(GameObject o) {
		return false;
	}

}
