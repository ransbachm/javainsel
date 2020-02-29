package com.insel.after.sorting;

import java.util.Arrays;

public class CountingSort {
	public static void sort(int [] list) {
		int [] oldList = Arrays.copyOf(list, list.length);
		//System.out.println("Counting sort start");
		//System.out.println("original array" + Arrays.toString(list));
		int [] testSort = Arrays.copyOf(list, list.length);
		Arrays.sort(testSort);
		//System.out.println("original sorted" + Arrays.toString(testSort));
		int length = oldList.length;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < oldList.length; i++) {
			if(oldList[i] < min) 
				min = oldList[i];
			if(oldList[i] > max) 
				max = oldList[i];
		}
		//System.out.printf("Length: %d Min: %d Max: %d%n", length, min, max);
		int min2 = min;
		int[] countArray = new int[max-min+1];
		int last = timesInList(oldList, min2++);
		countArray[0] = last;
		for (int i = 1; i < countArray.length; i++) {
			countArray[i] = timesInList(oldList, min2++) + last;
			last = countArray[i];
		}
		//System.out.printf("Min1 : %d, Min2 : %d%n", min, min2);
		//System.out.println(Arrays.toString(countArray));
		for(int i = 0; i < oldList.length; i++) {
			//System.out.println(Arrays.toString(list));
			int crr = oldList[i];
			//System.out.println("Crr " + crr + "Min" + min);
			list[countArray[crr-min]-- -1] = crr; 
		}
		
	}
	
	private static int timesInList(int[] list, int number) {
		int occ = 0;
		for (int i = 0; i < list.length; i++) {
			if(list[i] == number)
				occ++;
		}
		
		return occ;
	}

}
