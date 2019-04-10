package com.java.fundamentals.constructors;

public class Constructors {
	
	private String name ="Vincent";
	{System.out.println(name);}
	private static int COUNT = 0;
	static{
		System.out.println(COUNT);
	}
	{
		COUNT++;
		System.out.println(COUNT);
	}
	

	public Constructors() {
		System.out.println("This is the constructor");
	}

	public static void main(String[] args) {
		System.out.println("This is the main method");
		new Constructors();
		new Constructors();
	}

}
