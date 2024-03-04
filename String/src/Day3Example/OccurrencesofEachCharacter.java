package Day3Example;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesofEachCharacter {

    public static void main(String[] args) {

        String s = "Pravin";

        Map<Character, Integer> charMap= new HashMap<>();

        char[] strArray = s.toCharArray();
        
        for (char c: strArray) {
        	if(charMap.containsKey(c)) {
        		charMap.put(c, charMap.get(c)+1);
        	}else {
        		charMap.put(c, 1);
        	}
        }
       System.out.println(s +" : " +charMap);
    }
}

