
public class Unrepeated_num_in_Array_Bitwise {

	public static void main(String[] args) {
		int[] arr = {1,5,8,6,5,6,1,2};
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if((arr[i]^arr[j])==0 && i!=j) {
					count++;
				}
			}
			if(count==0) {
				System.out.print(arr[i]+",");
			}
			
		}
		

	}

}
