package com.geekster;

import java.util.Scanner;

public class Min_num_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i]=s.nextInt();
		}
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Minimum num in array : "+min);
	}


	

}
