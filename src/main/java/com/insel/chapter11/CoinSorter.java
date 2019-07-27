package com.insel.chapter11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CoinSorter {
	public static void main(String [] args) {
		System.out.println(getInCoins(1231));
		
	}
	public static List<Coin> getInCoins(int value) {
		List<Coin> list = new LinkedList<>();
		List<Coin> coins = new LinkedList<>(Arrays.asList(Coin.values()));
		while(true) {
				Coin c = coins.get(0);
				System.out.printf("%s %d%n", c.toString(), value);
				
				if(c.getValue() > value) {
					coins.remove(0);
					continue;
				}
				list.add(c);
				value -= c.getValue();
				if(value == 0) {
					System.out.println();
					return list;
				}
				System.out.println();
		}
	}
}

