package com.insel.chapter11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CoinSorter {
	public static void main(String [] args) {
		int[] valueRaw = new int[] {17, 43};
		int value = euroToCent(valueRaw);
		System.out.println(value);
		System.out.println(getInCoins(value));
		
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
	public static int euroToCent(int ... c) {
		return (c[0]*100) + c[1];
	}
}

