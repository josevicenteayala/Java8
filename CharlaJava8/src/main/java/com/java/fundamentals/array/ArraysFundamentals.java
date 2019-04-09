package com.java.fundamentals.array;

import java.util.Arrays;

public class ArraysFundamentals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArray = new int[10];
		
		int[] intArray2 = new int[] {1,2,3};
		
		System.out.println(Arrays.binarySearch(intArray2, 4));
		System.out.println(Arrays.binarySearch(intArray2, 1));
		System.out.println(Arrays.binarySearch(intArray2, 2));
		System.out.println(Arrays.binarySearch(intArray2, 3));
		
		String[] stringArray = new String[] {"160","26","113","vin","Vin","vIn","VIn"};
		Arrays.sort(stringArray);
		System.out.println("stringArray "+Arrays.toString(stringArray));
		System.out.println("stringArray "+stringArray.toString());
		
	}

}
