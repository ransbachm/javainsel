package com.insel.after.sorting;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String [] args) {
		
		int [] numbers = {7, 14, 16, 5, 16, 7, 11};
		int [] unsorted = Arrays.copyOf(numbers, numbers.length);
		int [] ownArray = Arrays.copyOf(numbers, numbers.length);
		Arrays.sort(numbers);
		QuickSort.sort(ownArray);
		
		
		
		System.out.printf("Original List: %s%n", Arrays.toString(unsorted));
		System.out.printf("Built-in Sorting: %s%n", Arrays.toString(numbers));
		System.out.printf("Own Sort: %s%n", Arrays.toString(ownArray));
		
		//disable
		if(Math.sqrt(1) == 1) return;
		
		// Large tester
		int testSize = 100_000;
		int[] largeList1 = new int[testSize];
		int[] largeList2 = new int[testSize];
		
		fillArray(largeList1);
		largeList2 = Arrays.copyOf(largeList1, largeList1.length);
		
		System.out.println("Done filling");
		Arrays.sort(largeList1);
		System.out.println("Done sorting 1");
		CountingSort.sort(largeList2);
		System.out.println("Done sorting2");
		
		if(Arrays.equals(largeList1, largeList2)) {
			System.out.println("They equal");
		} else {
			System.out.println("They are different");
		}
		
		
	}
	
	private static void fillArray(int [] list) {
		Random r = new Random();
		for (int i = 0; i < list.length; i++) {
			list[i] = r.nextInt(100);
		}
	}
	
	
	

}
