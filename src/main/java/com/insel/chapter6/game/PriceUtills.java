package com.insel.chapter6.game;

public class PriceUtills {
	
	public static double calculateSum(Buyable price1, Buyable ... bas) {
		
		double res = 0;
		res += price1.price();
		
		for(Buyable cr : bas) {
			res += cr.price();
		}
		return res;
	}

}
