package com.java.fundamentals.string;

public class StringBuilderFundamentals {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder("animals");
		stringBuilder.insert(7, "-");
		System.out.println(stringBuilder);
		stringBuilder.insert(0, "-");
		System.out.println(stringBuilder);
		stringBuilder.insert(4, "-");
		System.out.println(stringBuilder);
	}

}
