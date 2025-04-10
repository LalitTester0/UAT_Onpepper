import java.util.Calendar;

public class calander {

	public static void main(String[] args) {
	
		   Calendar c = Calendar.getInstance(); 
		  int month = c.get(Calendar.MONTH)+1;
		  int year=c.get(Calendar.YEAR);
		  
		  String day=year+"-"+month+"-"+05;

	        String test = "View other +43";
	        
	        // Split the string by "+" and take the second part, trimming any spaces
	        String number = test.split("\\+")[1].trim();
	        
	        // Output the result
	        System.out.println("Extracted number: " + number);  // Output: 43

		  
		  
	}

}
