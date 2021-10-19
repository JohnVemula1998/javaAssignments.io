package Arrays_2D;

public class Arrays_2D_diagonal_check {

	public static void main(String[] args) {
		
		int[][] arr = {{1,0,0},{0,1,0},{0,0,1}};
		int ans=arr[0][0];
//		System.out.println(arr[0][0]);
//		System.out.println(arr[1][1]);
//		System.out.println(arr[2][2]);
		int n=0;
		for(int j=0;j<arr.length;j++) {
			n =0;
			for(int i=0;i<arr[j].length;i++) {
				if(i==j) {
					if(arr[i][j]==ans) {
						n++;
						continue;
					}else {
						System.out.println(false);
						break;
					}
					//System.out.println(true);
				}
				
			}
		}
			if(n==1) {
				System.out.println(true);
			}
		


	}

}
