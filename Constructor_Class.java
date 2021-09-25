package com.geekster;

public class Constructor_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling a Constructor with Parameters.
		Constructor obj1= new Constructor(1,"Rock",23);
		System.out.println("Constructor with arguments");
		obj1.show();
		//calling a Constructor with no Parameters.
		Constructor obj2 = new Constructor();
		System.out.println("Constructor with no arguments");
		obj2.show();
		//calling a constructor with only one value.
		Constructor obj3 = new Constructor(3);
		System.out.println("Constructor with one argument and other Default Values");
		obj3.show();
		

	}

}
