package Arrays_2D;

public class Arrays_2D_sum_of_Columns {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{4,5,9},{7,5,12}};
		int n=0;
		for(int i=0;i<arr.length;i++) {
			n=0;
			if(arr[i][0]+arr[i][1]==arr[i][2]) {
				n++;
			}else {
				System.out.println(false);
				break;
			}
		}
		if(n==1) {
			System.out.println(true);
		}

	}

}
