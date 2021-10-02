import java.util.Scanner;
public class Using_And_Or_operators {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = s.nextInt();
		System.out.println("Enter the value of b:");
		int b = s.nextInt();
		System.out.println("Result of Bitwise & opreator is "+(a&b));
		System.out.println("Result of Bitwise | opreator is "+(a|b));
		

	}

}
