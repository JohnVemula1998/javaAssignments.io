package com.geekster;
import java.util.*;
public class Calling_by_Operator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number:");
		int x = s.nextInt();
		System.out.println("Enter second number:");
		int y = s.nextInt();
		s.nextLine();
		System.out.println("Enter the operator:");
		String operator = s.nextLine();
		
		if(operator.equals("add")) {
			int n1 = add(x,y);
			System.out.println(n1);
		}else if(operator.equals("multiple")) {
			int n2 = multiple(x,y);
			System.out.println(n2);
		}else {
			System.out.println("Invalid operator");
		}
		

	}
	static int add(int a,int b) {
		System.out.println("Addition of Two Numbers");
		return a+b;
	}
	static int multiple(int a,int b) {
		System.out.println("Multiplication of Two Numbers");
		return a*b;
	}

}
