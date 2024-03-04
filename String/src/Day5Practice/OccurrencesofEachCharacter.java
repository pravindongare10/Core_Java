 package Day5Practice;

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
       
       int maxCount=0;
       char maxChar=' ';
       
       for(Map.Entry<Character, Integer> me : charMap.entrySet()) {  
    	   if(maxCount < me.getValue()) {
    		   maxCount=me.getValue();
    		   maxChar=me.getKey();
    	   }
       }
       
       System.out.println("Most Repeted Charector in String:"+maxChar);
       System.out.println("Total no of occarance:"+maxCount);
    }

	
}

