   package Concurent;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHm {

	public static void main(String[] args) {
		Map<Integer,String> ch=new ConcurrentHashMap<>();
		
		ch.put(1, "P");
		ch.put(2, "R");
		ch.put(2, "V");
	
        Set<Integer>keys=ch.keySet();
		  
		 for(int key:keys){ 
		 String val=ch.get(key); 
		 System.out.println(val); 
		}
	
		//System.out.println(ch);
	}

}
