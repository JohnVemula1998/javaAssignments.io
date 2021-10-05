package AkshaysirAssignment;

public class Merge_sorted_Array {

	public static void main(String[] args) {
		//initializing first Array 
		int[] arr1 = {1,2,3,4};
		//initializing second Array
		int[] arr2 = {4,5,6,7,8};
		//finding length of array 1;
		int n1 = arr1.length;
		//finding length of array 2
		int n2 = arr2.length;
		//declaring an array with size of both array1 and array2;
		int[] Merge_Arr = new int[n1+n2];
		//using for loop pushing array 1 elements into Merge array;
		for(int i=0;i<n1;i++) {
			Merge_Arr[i] = arr1[i];
		}
		//using for loop pushing array 2 elements into Merge array;
		for(int k = 0;k<n2;k++) {
			Merge_Arr[n1] = arr2[k];
			n1++;
		}
		////using for loop printing Merge array elements;
		for(int j=0;j<9;j++) {
			System.out.println(Merge_Arr[j]);
		}
		

	}

}
