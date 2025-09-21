package dataType;

public class StringDataType {

	public static void main(String[] args) {
		String firstName="Faiza";
     /*
      * String = data type
      * firstName= variable name
      * ""= quotation mark, in java we called it String
      * Faiza= is the value of the variable
      * ;= end of the line
      * inside the " " you can write anything
      * only addition is allow
      */
		String lastName="Nisa";
		
		
	String	fullName=firstName + lastName;
	System.out.println(fullName);
	
	// Concatenation
	String fullName1=firstName +" "+lastName;
	System.out.println(fullName1);
	System.out.println("My first name is  "+ firstName);
	
	System.out.println("My last name is   "+ lastName);	
	
	
	}

}
