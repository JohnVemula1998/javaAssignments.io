package com.geekster;
import java.util.Scanner;
public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int N = s.nextInt();
		String n="";
		for(int i = 1;i<=N;i++) {
			for(int j =N;j>=i;j--) {
				//n= n+"&";
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("& ");
			}
			System.out.println();
			
		}

	}

}
