package com.geekster;
//Creating a Class Method Overloading
public class Method_Overloading {
	/*
	 * to define method overloading I use "add" as the 
	 * name of different methods. i.e add is a name used to multiple 
	 * methods perform multiple operations, when called.
	 */
	public static void add(int a, int b) {
		int sum = a+b;
		System.out.println("Adding two Integer values: "+sum);
		
	}
	public static void add(int a, int b,int c) {
		int sum = a+b;
		System.out.println("Adding three Integer values: "+sum);
		
	}
	public static void add(double a, int b) {
		System.out.println("Adding one double and one Integer values: "+a+b);
		
	}
	
	public static void add(double a, double b) {
		
		System.out.println("Adding two double values: "+a+b);
		
	}

}
