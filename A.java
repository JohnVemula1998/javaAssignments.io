package com.geekster;

public class A {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		B obj = new B();
		//method using static in Class B
		B.show();
		//method not using static in Class B
		obj.add(5,6);
		//Giving input From User
		obj.sum();
	
		}

}
