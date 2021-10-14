package Strings_Practice;

public class String_Print_Using_n {

	public static void main(String[] args) {
		String str = "aaabbbccc";
	        int n=3;
	        for(int i=0;i<str.length();i++) {
	            System.out.print(str.charAt(i));
	            if((i+1)%n==0) {
	            	System.out.println();
	            }
	        }
	    }	
}
