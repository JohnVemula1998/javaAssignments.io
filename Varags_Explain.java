package com.geekster;

public class Varags_Explain {
	/*
	 * In the main Function We are allowed to convert "Strings[] args" to "String... args".
	 * let's see in main Function. 
	 */

	public static void main(String... args) {
		//With Providing elements calling A method which contains varags.
		A(0);//0
		A(1,2);//2
		A(4,2,3);//3
		//We can Provide Any No:of Arguments.
		//here we definitely have to give one integer value because 
		//in parameters we provide one integer value. i.e we have to give parameters when called.
		 B(10,23);  
		 C("John","Rock","Brock","Kane");

	}
	/*
	 * here we are not providing any element to variable length
	 * argument (varags).                                                                   
	 * By default Varags are one dimensional arrays.
	 */
	public static void A(int... x) {
		System.out.println("Length of the array x: "+x.length);
		//We are allowed to perform all the operations related to Arrays.
		//finding index.
		System.out.println("Index at x[0]: "+ x[0]);
	}
	//providing one integer in parameter.
	public static void B(int a,int ...x) {
		//a =10;
		System.out.println("Length of array x "+x.length);
		System.out.println("Index at x[0]: "+ x[0]);
	}
	//this is the array of Strings with no length.
	// in variable length arguments size is not to given.it cause error if size provides.
	public static void C(String ...s) {
		//Reversing the given String
		String rev = "";
		for(int i =s.length-1;i>-1;i--) {
			rev = rev+s[i]+" ";
		}
		System.out.println(rev);
		
	}
	

}
