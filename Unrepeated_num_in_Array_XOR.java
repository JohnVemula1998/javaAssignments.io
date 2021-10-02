
public class Unrepeated_num_in_Array_XOR {

	public static void main(String[] args) {
		int[] arr = {20,10,30,10,30};
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if((arr[i]^arr[j])==0 && i!=j) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(arr[i]+" ");
			}
			
		}
		

	}

}
