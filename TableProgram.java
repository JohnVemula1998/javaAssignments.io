package com.geekster;
import java.util.Scanner;
public class TableProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Which Table do you want");
		int n = s.nextInt();
		for (int i=1;i<11;i++) {
			System.out.println(n+"*"+i+"="+n*i);
		}

	}

}
