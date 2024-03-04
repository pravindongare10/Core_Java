package StreamAPi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveNullAndConvertUpparcase {

	public static void main(String[] args) {
		
	List<String> ls=new ArrayList<>();
	ls.add("p");
	ls.add("j");
	ls.add("b");
	ls.add("g");
	ls.add(null);
	
	List s=ls.stream().filter(i->i!=null).map(i->i.toUpperCase()).collect(Collectors.toList());
	System.out.println(s);
	s.forEach(e->System.out.println(e));
	}

}
