public class Largest_Num {
	public static void main(String[] args) {
		//largest number
		int[] num = {1,45,67,68,98,32};
		int max = num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}System.out.println(max);
	}

}
