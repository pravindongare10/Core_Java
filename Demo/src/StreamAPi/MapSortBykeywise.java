 package StreamAPi;

import java.util.HashMap;
import java.util.Map;

public class MapSortBykeywise {

	public static void main(String[] args) {
		// Map Sort By keywise
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(5, "kishor");
		m.put(6,"sagar");
		m.put(1, "nilesh");
		m.put(4, "Rahul");
		m.put(3, "girish");
		m.put(2, "bhushan");
		m.put(7, "tushar");
		m.forEach((k, v) -> System.err.println("Key = " + k + " " + "Value = " + v));
		//OR
		for(Map.Entry entry : m.entrySet())
		{
		System.out.println(entry.getKey() +" "+ entry.getValue());
		}	

	}
	
	
	
}
