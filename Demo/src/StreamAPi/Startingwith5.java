package StreamAPi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Startingwith5 {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(123, 567, 234, 589, 512, 876);

        List<Integer> result = numbers.stream()
                .filter(n -> n.toString().startsWith("5"))
                .collect(Collectors.toList());

        System.out.println("Numbers starting with 5: " + result);
    }

}
