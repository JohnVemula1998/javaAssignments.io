package com.geekster;

import java.util.Scanner;

public class Asending_Or_Not {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int arr[] = new int[8];
		for(int i=0;i<arr.length;i++) {
			arr[i]= s.nextInt();
		}
			
	
		int check=0;
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]<arr[j+1]) {
				check = check+1;
			}
	}
		if(check==7) {
			System.out.println("Yes, array is in acsending order");
		}else {
			System.out.println("Yes, array is not in acsending order");
		}
		
}
 

}
