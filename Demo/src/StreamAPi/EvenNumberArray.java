     package StreamAPi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class EvenNumberArray {

	public static void main(String[] args) {
		
	        List<Integer> numbers = Arrays.
	                               asList(1, 4, 8, 40, 11, 22, 33, 99);
	        List<Integer> evenNumbers = numbers.stream().
	                                     filter(o -> o % 2 == 0).
	                                      collect(Collectors.toList());
	       // evenNumbers.forEach(System.out::println);
	    evenNumbers.forEach(i->System.out.println(i));
    
		
		/*
		 * List<Integer>list=Arrays.asList(11,33,33,22,44,55);
		 * List<Integer>ls=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		 * ls.forEach(System.out::println);
		 */
		 
		
		/*
		 * List<Integer>list=Arrays.asList(11,22,33,44);
		 * List<Integer>ls=list.stream().map(i->i*2).collect(Collectors.toList());
		 * ls.forEach(i->System.out.println(i));
		 * 
		 */ 
	/*	
		List<Integer>num=Arrays.asList(10,0,2,4,6,8);
		 getPair(num);
	}

	private static void getPair(List<Integer> num) {
		num.stream().map(n->{
			int temp=0;
			for(int s:num) {
				if(n+s==10) {
					temp=s;
				}
			}
			return n +"  "+temp;
		}).collect(Collectors.toList()).forEach(System.out::println);
	*/  	
	} 
	 
}
