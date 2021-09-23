package com.geekster;

public class Reverse_EachWord_in_String {
	public static void main(String[]args) {
		String str1 = "Java is better than python";
		//using inbuilt split method to create an array of strings.
		String[] strarr = str1.split(" ");
		//creating a empty string to append the result.
		String reverse = "";
		//for loop to iterate over string array.
		for(int i =0;i<strarr.length;i++) {
			//calling the user defined method to reverse word.
		reverse = reverse+ReverseWord(strarr[i]+" ");
		}System.out.println(reverse);
	}
	//creating a user defined method to reverse the string.
	public static String ReverseWord(String str) {
		String rev = "";
		for(int i=str.length()-1;i>-1;i--) {
			rev = rev + str.charAt(i);
			
		}
		return rev;
	}

}
