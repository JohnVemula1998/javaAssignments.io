package com.geekster;

public class Miss_num_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//giving an Array of series 1 t0 15 with missing num;
		int[] arr = {1,2,3,4,5,6,7,8,9,11,12,13,14,15};
		//using for loop for iteration.
		int n = arr.length;
		int sum1 = 0;
		int sum2= 0;
		int max =arr[n-1];
		//using for loop get the sum of elements in array.
		for(int i=0;i<arr.length;i++) {
			sum1+=arr[i];
		}
		//System.out.println(sum1);
		//using for loop finding sum of elements with in the range of max num in array.
		for(int j=1;j<=max;j++) {
				sum2 += j;
		}
		//System.out.println(sum2);
		System.out.println("Missing Num in series:"+(sum2-sum1));
		
		

	}

}
