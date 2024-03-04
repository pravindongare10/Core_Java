package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LHM {

	public static void main(String[] args) {
		
		Map<Integer,String>map=new LinkedHashMap<>();
		map.put(1, "P");
		map.put(2, "R");
		map.put(3, null);
		map.put(2, "V");
		map.put(null, "K");
		map.put(null, "A");
		//System.out.println(map);
		
		
		/*
		 * Set<Integer>keys=map.keySet();
		 * 
		 * for(int key:keys) { String val=map.get(key); System.out.println(val); }
		 */
		 
		System.out.println(map);
		

	}

}
