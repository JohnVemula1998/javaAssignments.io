
public class Is_Prime {
	public static void main(String[] args) {
		//prime number
		int x = 16;
		int count =0;
		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				count=1;
				break;
				}
		}
		if(count>0) {
			System.out.println("Not a Prime Number");
		}
		else {
			System.out.println("Prime Number");
			}
	}
}
