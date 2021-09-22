package com.geekster;
import java.util.Scanner;

public class Prime_numInGiven_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		;
		Scanner sc= new Scanner(System.in);
		System.out.println("Starting num to chek the primes:");
		int x = sc.nextInt();
		System.out.println("Prime Numbers in Given Range:");
		int y = sc.nextInt();
		sc.close();
		System.out.println("End num to check the primes:");
		PrimeNumbers(x,y);
		

	}
	//creating a method named "PrimeNumbers"
	public static void PrimeNumbers(int a, int b) {
		
		//using for loop to get range between start and end numbers.
		for(int i=a;i<=b;i++) {
			//count variable to check the prime number.
			int count = 0;
			//System.out.print(i+" ");
			//using 2 for loop to calculate prime numbers.
			for (int j=2;j<=i;j++) {
				//use if condition to checking "i" is prime or not.
				if(i%j==0) {
					count+=1;
				}
			}
			//another if condition to print the prime "i".
				if (count==1) {
					System.out.print(i+" ");
				}
		}
	}

}
