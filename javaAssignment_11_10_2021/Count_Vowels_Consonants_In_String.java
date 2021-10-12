package Assignment_11_10_2021;

public class Count_Vowels_Consonants_In_String {

	public static void main(String[] args) {
		String str = "This is a really simple sentence";
		str.toLowerCase();
		int count =0;
		int count2=0;
		for(int j =0;j<str.length();j++) {
			char ch = str.charAt(j);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}else if(ch ==' ') {
				continue;
			}else {
				count2++;
			}
		}
		System.out.println("Number of Vowels = "+count);
		System.out.println("Number of Consonants = "+count2);


	}

}
