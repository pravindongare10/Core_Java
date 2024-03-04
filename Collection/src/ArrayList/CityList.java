package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CityList {

	public static void main(String[] args) {
		
		List<String>cities=new ArrayList<>();
		cities.add("Pune");
		cities.add("Mumbai");
		
		/*
		 * Iterator<String>itr=cities.iterator();
		 * 
		 * while(itr.hasNext()) { String city=itr.next(); System.out.println(city); }	 
	*/
		for(String city:cities) {
			System.out.println(city);
		}
	
		String ct=cities.get(1);
		System.out.println(ct);
	}	
}