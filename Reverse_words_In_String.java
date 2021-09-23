package com.geekster;

public class Reverse_words_In_String {
	//reversing the words in the string.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Java is better than Python";
		//creating a string array by using split method.
		String[] strarr = str.split(" ");
		String rev = "";
		for(int i=strarr.length-1;i>-1;i--) {
			rev = rev+ strarr[i]+" ";
		}
		System.out.println(rev);

	}

}
