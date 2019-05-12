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
		
		Object[] arrayObject = new String[10];
		Arrays.fill(arrayObject, "String value");
		
		System.out.println(Arrays.toString(arrayObject));
		Object[] copyOfNewArray5 = Arrays.copyOf(arrayObject,15);
		System.out.println(Arrays.toString(copyOfNewArray5));
		
		System.out.println(Arrays.deepHashCode(arrayObject));
		
		final int count =0;
		Arrays.stream(stringArray).map(s->s.concat("..."));
		System.out.println(Arrays.deepToString(stringArray));
	}

}
