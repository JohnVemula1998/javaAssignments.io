package Assignment_11_10_2021;

public class Punctuation_Marks_Count_I_String {

	public static void main(String[] args) {
		String str = "He said, 'The mailman loves you.' I heard it with my own ears.";
		int count =0;
		
		for(int j =0;j<str.length();j++) {
			char ch = str.charAt(j);
			if(ch==','||ch=='.'||ch=='\''||ch=='\"') {
				count++;
			}
		}
		System.out.println(count);


	}

}
