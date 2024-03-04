package Set;

import java.util.HashSet;
import java.util.Set;

public class HashsetNumber {

	public static void main(String[] args) {
		
		Set<Integer>hs=new HashSet<>();
		
		hs.add(2);
		hs.add(2);
		hs.add(1);
		hs.add(null);
		hs.add(null);
		hs.add(3);
		hs.add(2);
		
		
		/*
		 * for( Integer nm:hs) { System.out.println(nm); }
		 */
		System.out.println(hs);
	}
	

}
