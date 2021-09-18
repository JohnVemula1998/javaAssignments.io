/**
 * 
 */
package com.geekster;
import java.util.*;

/**
 * @author johnv
 *
 */
public class Is_Palindrome1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Type a string:");
		String str = s.nextLine();
		String rev ="";
		int len = str.length();
		for(int i=len-1;i>-1;i--) {
			rev = rev+str.charAt(i);
		}
		//System.out.println("Reverse String:"+rev);
		if(str.equals(rev)) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("Given string is Not a Palindrome");
		}
		

	}

}
