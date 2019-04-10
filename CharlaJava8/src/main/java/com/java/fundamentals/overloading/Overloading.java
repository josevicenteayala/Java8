package com.java.fundamentals.overloading;

import java.util.Arrays;
import java.util.List;

public class Overloading {

	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		overloading.method(new int[] {1,2,3});
		overloading.method(new Integer[]{1,2,3});
		List<Integer> asList = Arrays.asList(1,2,3);
		overloading.method(asList);
	}
	
	public void method(int [] integers) {
		System.out.println("Overloading.method(int [] integers)");
	}
	
	public void method(Integer ...integers) {
		System.out.println("Overloading.method(Integer ... integers)");
	}

	public void method(Object object) {
		System.out.println("Overloading.method(Object object)");
	}
}
