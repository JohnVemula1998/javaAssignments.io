package com.geekster;

public class Max_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,6,31,7,9,78,34,11,13,44};
		int max = arr[0];
		int min = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Maximum value in array is:"+max);
		System.out.println("Minimum value in array is:"+min);

	}

}
