package com.geekster;
import java.util.Scanner;

public class Checking_the_string_is_Alphanumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//importing Scanner class to provide user defined String.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check AphaNumeric:");
		String a = sc.nextLine();
		//Assigning/storing return value to boolean x. 
		boolean x = IsAphaNumeric(a);
		System.out.println(x);

	}
	public static boolean IsAphaNumeric(String s) {
		//used inbuilt ".matches" method to check condition. 
		if(s.matches("[a-zA-Z0-9]+")) {
			return true;
		}else {
			return false;
		}
		
	}

}
