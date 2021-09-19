package com.geekster;
import java.util.Scanner;
public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n = s.nextInt();
		String str = "";
		for (int i=0;i<n;i++) {
			str=str+"*";
			System.out.println(str);
		}

	}

}
