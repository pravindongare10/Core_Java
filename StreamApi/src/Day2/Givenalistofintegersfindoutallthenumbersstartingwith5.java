package Day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Givenalistofintegersfindoutallthenumbersstartingwith5 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(123, 567, 234, 589, 512, 876);

        List<Integer> result = numbers.stream().filter(i->i.toString().endsWith("5")).collect(Collectors.toList());
                

        System.out.println("Numbers starting with 5: " + result);
		
	}

}
