package ArunSir_Assignment;

public class Panagram_Check {

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwzzzzzz";
		str.toLowerCase();
		boolean x=isPangram(str);
		System.out.println(x);

	}
	private static boolean isPangram(String s) {
		if(s.length()<26) {
			return false;
		}else {
			for(char ch ='a';ch<='z';ch++) {
				if(s.indexOf(ch)<0) {
					return false;
				}
			}
			return true;
			
		}
	}

}
