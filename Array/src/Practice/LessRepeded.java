package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LessRepeded {

	public static void main(String[] args) {
		int [] a = {2, 3, 4, 2, 2, 8, 9, 4, 3, 4, 8, 4, 2, 2};
	   
	    
	    Map<Integer,Integer> countMap=new HashMap<>();

	   
        for (int c: a) {
        	if(countMap.containsKey(c)) {
        		countMap.put(c, countMap.get(c)+1);
        	}else {
        		countMap.put(c, 1);
        	}
        }
        System.out.println(countMap);
        int minCount=0;
        int occurence=0;
        
        for(Entry<Integer, Integer> me : countMap.entrySet()) {  
     	   if(me.getValue()==1) {
     		   minCount=me.getValue();
     		   occurence=me.getKey();
     	   }
        }
        
        System.out.println("Most LessRepeted Charector in String:"+minCount);
        System.out.println("Total no of occarance:"+occurence);

	  

	}
	    

}
