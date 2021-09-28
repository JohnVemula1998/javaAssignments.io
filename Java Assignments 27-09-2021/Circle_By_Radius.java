package com.geekster;
import java.util.*;

public class Circle_By_Radius {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Radius of Circle:");
		int r = s.nextInt();
		circumference(r);
		radius(r);
		

	}
	static void circumference(int r) {
		int n = 2;
		double d = 3.14;
		System.out.println("Circumference of Circle:"+n*d*r);
	}
	static void radius(int r) {
		int n = 2;
		double d = 3.14;
		int n1 = r*r;
		System.out.println("Area of Circle:"+d*n1);
	}

}
