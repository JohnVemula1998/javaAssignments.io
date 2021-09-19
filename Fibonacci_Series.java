package com.geekster;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = s.nextInt();
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		
		System.out.print(n1+" "+n2);
		for(int i=0;i<n+1;i++) {
			sum = n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		

	}

}
