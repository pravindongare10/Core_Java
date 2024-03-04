
package StreamAPi;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class UsingJava8CalBirth {
	
	 public static void main(String[] args) {
	        // Example usage
	        String birthdate = "1999-05-15"; // Replace with the actual birthdate in "yyyy-MM-dd" format
	        LocalDate currentDate = LocalDate.now();

	        Function<String, Integer> calculateAge = (birthdateString) -> {
	            // Parse the birthdate string to LocalDate
	            LocalDate birthdateDate = LocalDate.parse(birthdateString);

	            // Calculate the difference between birthdate and current date
	            Period period = Period.between(birthdateDate, currentDate);

	            // Return the age
	            return period.getYears();
	        };

	        int age = calculateAge.apply(birthdate);
	        System.out.println("Age: " + age + " years");
	    }

}
