package com.geekster;

public class Given_num_to_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,6,8,12,76,23,64};
		int num = 76;
		for(int i=0;i<arr.length;i++) {
			if(num!=arr[i]) {
				System.out.print(arr[i]+" ");
			}else {
				System.out.print(0+" ");
			}
		}

	}

}
