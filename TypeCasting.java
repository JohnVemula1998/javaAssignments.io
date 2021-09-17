package com.geekster;
import java.util.Scanner;
public class TypeCasting {
	public static void main(String[] args) {
		//Creating a user defined Input.
		Scanner x = new Scanner(System.in);
		//Defining a integer.
		int Int = x.nextInt();
		//converting a integer to string. 
		String str = Integer.toString(Int);
		System.out.println(str);
		//finding length of String.
		System.out.println(str.length());
		//converting string to float.
		float f1 = Float.parseFloat(str);
		System.out.println(f1);
		//converting float to double;
		double d1 = (double) f1;
		System.out.println(d1);
		//converting double to float.
		float f = (float)d1;
		System.out.println(f);
		//converting float to integer.
		int i = (int)f;
		System.out.println(i);
		
	}

}
