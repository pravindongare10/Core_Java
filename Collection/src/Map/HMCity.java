package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HMCity {

	public static void main(String[] args) {
		
		Map<Integer,String>city=new HashMap<>();
		
		city.put(1, "P");
		city.put(2, "R");
		city.put(3, null);
		city.put(2, "V");
		city.put(null, "K");
		city.put(null, "A");
		//System.out.println(city);
		
		/*
		 * Set<Integer>keys=city.keySet();
		 * 
		 * for(int key:keys) { String val=city.get(key); System.out.println(val); }
		 */
		System.out.println(city);
	}

}
