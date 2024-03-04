package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {

	public static void main(String[] args) {
		
		List<String>Pune=new ArrayList<>();
		Pune.add("mancher");
		Pune.add("pimpari");
		Pune.add("Karvenager");
		
		List<String>Ahm=new ArrayList<>();
		Ahm.add("Akole");
		Ahm.add("Kotul");
		Ahm.add("Pangari");
		
		
		List<List<String>>State=new ArrayList<>();
		State.add(Pune);
		State.add(Ahm);
		
		for(List<String>cities:State) {
			for(String city:cities) {
				System.out.println(city);
			}
		}
		
	}

}
