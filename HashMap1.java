package HashMap_Practice;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		String str = "tit for tat";
		HashMap<Character,Integer>dataMap= new HashMap<>();
		for(int i=0;i<str.length();i++) {
			Character ch = str.charAt(i);
			if(ch>='a'&&ch<='z')
			if(dataMap.containsKey(ch)) {
				Integer value = dataMap.get(ch);
				value++;
				dataMap.put(ch,value);
			}else {
				dataMap.put(ch, 1);
			}
		}
		
		int max =0;
		char maxChar=0;
		for(Character key:dataMap.keySet()) {
			if(max < dataMap.get(key)) {
				max= dataMap.get(key);
				maxChar = key;
			}
		}
		System.out.println(max+" "+maxChar);
		for(Map.Entry<Character,Integer> e:dataMap.entrySet()) {
			System.out.println("key : "+e.getKey()+" , value : "+e.getValue());
		}

	}
	

}
