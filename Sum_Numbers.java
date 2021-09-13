public class Sum_Numbers {
	public static void main(String[] args) {
		//sum of given numbers in array
		int[] num = {1,2,3,4,5,6,7,8,9,23,45};
		int sum =0;
		for (int i =0;i<num.length;i++) {
			sum =sum + num[i];
		}
		
		System.out.println(sum);
		
	}

}