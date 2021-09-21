package com.geekster;

public class FindNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,6,8,33,57,24,87,12,9,122};
		int num = 87;
		int cou =0;
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(num==arr[i]) {
				cou++;
				index=i;
				break;
			}
		}if(cou>0) {
			System.out.println("Num is Present at index: "+index);
		
		}else {
				System.out.println("Num is Not Present");
			}
		
		

	}

}
