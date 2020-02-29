package com.insel.after.sorting;

public class BubbleSort {
	public static void sort(int[] list) {
		
		boolean isSorted = true;
		int buf;
		do {
			isSorted = true;
			for(int i=0; i<list.length-1; i++) {
				if(list[i] > list[i+1]) {
					isSorted = false;
					buf = list[i];
					list[i] = list[i+1];
					list[i+1] = buf;
				}
			}
		} while(!isSorted);
		
	}

}
