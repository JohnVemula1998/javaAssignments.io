package com.geekster;
import java.util.Scanner;

public class B {
		
	public static void show() {
		//Method defined by static
		System.out.println("From Class B");
	}
	//methods with out using static.
	public void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	public void sum () {
		//input From User by Scanner class.
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		int z = (x.nextInt() + y.nextInt());
		System.out.println(z);
	}

}
