package com.insel.chapter11;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CoinSorter {
	
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
	
	public static int getValue() {
		Scanner scan = new Scanner(System.in);
		int[] valueRaw = new int[] {scan.nextInt(), scan.nextInt()};
		scan.close();
		scan = null;
		
		return euroToCent(valueRaw);
	}
	
	public static void main(String [] args) {
		int value = getValue();
		if(value<1) {
			return;
		}
		System.out.println(value);
		System.out.println(getInCoins(value));
		
	}
}

