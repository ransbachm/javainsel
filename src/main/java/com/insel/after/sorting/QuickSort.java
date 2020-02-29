package com.insel.after.sorting;

import java.util.Arrays;

public class QuickSort {
	public static void sort(int[] list) {
		int length = list.length;
		
		System.out.printf("Lengt: %d List: %n%s%n", length, Arrays.toString(list));
		
		int pivot = (int) Math.round(Math.random() * length);
		System.out.println("pivot : " + pivot);
		int[] leftList = new int[0];
		int[] rightList = new int[0];
		int leftCounter = 0;
		int rightCounter = 0;
		
		for (int i = 0; i < list.length; i++) {
			if(list[i] < list[pivot]) {
				int[] buf = new int[1];
				System.arraycopy(leftList, 0, buf, 0, leftList.length);
				leftList = buf;
				leftList[leftCounter++] = list[i];
			}
			else {
				int[] buf = new int[1];
				System.arraycopy(rightList, 0, buf, 0, rightList.length);
				rightList = buf;
				rightList[rightCounter++] = list[i];
			}
		}
		
		

		System.out.println("Sorted: " + Arrays.toString(list));
	}
	

}
