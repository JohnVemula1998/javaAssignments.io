package com.geekster;
import java.util.*;
public class Rev_Num2 {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a num:");
		int num = s.nextInt();
		String str = Integer.toString(num);
		char ch[] = str.toCharArray();
		int len = ch.length;
		//System.out.println(ch);
		String rev ="";
		for(int i=len-1;i>-1;i--) {
			rev = rev+ch[i];
			
		}
		System.out.println("Reverse Number is:"+rev);
	}

}
