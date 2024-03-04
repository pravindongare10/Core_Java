package Day5Practice;

import java.util.HashMap;
import java.util.Map;

public class RepetedString {

	public static void main(String[] args) {
		
		String s="pravinn";
		Map<Character,Integer>mp=new HashMap<>();
		char [] cc=s.toCharArray();
		for(char c:cc) {
			if(mp.containsKey(c)) {
				mp.put(c,mp.get(c)+1);
			}
			else {
				mp.put(c, 1);
			}
		}
		System.out.println(mp);
	int maxCount=0;
	char oc=' ';
	for(Map.Entry<Character,Integer>me:mp.entrySet()) {
		if(maxCount<=me.getValue()) {
			maxCount=me.getValue();
			oc=me.getKey();
		}
	}
	System.out.println(maxCount);
	System.out.println(oc);
}
}