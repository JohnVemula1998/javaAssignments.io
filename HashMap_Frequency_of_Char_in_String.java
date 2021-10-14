package HashMap_Practice;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Frequency_of_Char_in_String {

	public static void main(String[] args) {
		
		String str = "aaabbbcccddeeeffffksacd";
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			Character ch = str.charAt(i);
			if(map.containsKey(ch)) {
				Integer value = map.get(ch);
				value++;
				map.put(ch, value);
			}else {
				map.put(ch, 1);
			}
		}
		for(Map.Entry<Character,Integer> e:map.entrySet()) {
			System.out.print(e.getKey()+":"+e.getValue()+", ");
		}
		System.out.println();
		System.out.println(map);
		

	}

}
