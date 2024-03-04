package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LHSNumber {

	public static void main(String[] args) {
		
		Set<Integer> lhs=new LinkedHashSet<>();
		lhs.add(3);
		lhs.add(4);
		lhs.add(2);
		lhs.add(2);
		lhs.add(3);
		lhs.add(null);
		lhs.add(null);
		
		/*
		 * for(int val:lhs) { System.out.println(val); }
		 */
		System.out.println(lhs);
	}

}
