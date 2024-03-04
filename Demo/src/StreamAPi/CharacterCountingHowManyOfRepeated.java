package StreamAPi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountingHowManyOfRepeated {
    public static void main(String[] args) {
    	// remove particular name
    	List<String> ss =Arrays.asList("nilesh","kishor","sagar","deepak","girish","kishor","sagar","nilesh");
		List<String> stringremove = ss.stream().filter(s1 ->!"sagar".equals(s1)).collect(Collectors.toList());
		System.err.println("After Removing String is:" + stringremove);
		
		
		// character counting how many of repeated
		String name1="Pravinn";
		Map<Character, Long> countingrepeatation= name1.chars().mapToObj(i ->
		(char)i).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Character Counting" + countingrepeatation);
		  Long maxCount=(long) 0;
	       char maxChar=' ';
	       for(Entry<Character, Long> me :countingrepeatation.entrySet()) {  
	    	   if(maxCount < me.getValue()) {
	    		   maxCount=me.getValue();
	    		   maxChar=me.getKey();
	    	   }
	       }
	       
	       System.out.println("Most Repeted Charector in String:"+maxChar);
	       System.out.println("Total no of occarance:"+maxCount);
	    }
    			
	
}
 