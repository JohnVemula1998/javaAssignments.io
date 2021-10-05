package AkshaysirAssignment;

public class Remove_Given_Element_Array {

	public static void main(String[] args) {
		//Declaring an Array.
		int[] arr = {1,2,4,5,7};
		int n = 5;
		//Iterating an Array.
		for(int i=0;i<arr.length;i++) {
			//removing given element. 
			if(arr[i]==5) {
				continue;
			}
				System.out.print(arr[i]+" ");
			
		}

	}

}
