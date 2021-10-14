package HashMap_Practice;
import java.util.*;

public class HashMap_Get_Key_Value_Set {
	public static void main(String args[]) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "Rahul");
		map.put(2, "Ashutosh");
		map.put(3, "John");
		map.put(4, "Sanjay");
		map.put(5, "Aniul");
		for(Map.Entry<Integer, String> e:map.entrySet()) {
			System.out.println("key : "+e.getKey()+" , value : "+e.getValue());
		}
			
	}

}
