 package StreamAPi;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Getcurrentdateandtime {
	 public static void main(String[] args) {
	        // Get the current date and time
	        LocalDateTime currentDateTime = LocalDateTime.now();
	        
	        // Define a custom date and time format (optional)
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	        // Format the current date and time using the specified format
	        String formattedDateTime = currentDateTime.format(formatter);

	        // Print the formatted date and time
	        System.out.println("Current Date and Time: " + formattedDateTime);
	    }

}
