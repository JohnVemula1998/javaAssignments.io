package Assignment_11_10_2021;

public class Character_count_in_String {

	public static void main(String[] args) {
		String str = "The best of both worlds";
		String[] arr= str.split(" ");
		int count =0;
		int count2=0;
		for(int i =0;i<arr.length;i++) {
			count= count+arr[i].length();
		}System.out.println("number of Characters in given string "+count);
		char ch =' ';
		for(int j =0;j<str.length();j++) {
			if(ch ==str.charAt(j)) {
				continue;
			}else {
				count2++;
			}
		}
		System.out.println(count2);

	}

}
