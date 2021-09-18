package com.geekster;

import java.util.Scanner;

public class Is_Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Type a string:");
		String str = s.nextLine();
		char ch[] = str.toCharArray();
		int len = ch.length;
		//System.out.println(ch);
		String rev ="";
		for(int i=len-1;i>-1;i--) {
			rev = rev+ch[i];
			
		}
		System.out.println("Reverse Number is:"+rev);
		if(str.equals(rev)) {
			System.out.println("Given string is  a Palindrome");
		}else {
			System.out.println("Given string is Not a Palindrome");
		}

	}

}
