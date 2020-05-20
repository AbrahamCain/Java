import java.util.Scanner;
import java.lang.*;

public class IsEmail{
	
	public static void main(String[] args){
		
		/*
    Is Email 1.0
    A java program to check user input for an email address
    */
    
		//Initialize the Scanner
		Scanner scan = new Scanner(System.in);
		
		
		//Capture user input to userInput
		System.out.println("Please Enter An Email Address:");
		String userInput = scan.nextLine();
		
		
		//make some booleans to evaluate the characteristics of an email address
		boolean hasAt = userInput.contains("@");		//has an @ symbol
		boolean hasDot = userInput.contains(".");		//has a .something
		boolean lengthMin = (userInput.length() > 2);	//is at least 3 characters long
		
		
		//Tell us our results
		//If it meets all the above requirements, it is most likely an email address
		if (hasAt == true && hasDot == true && lengthMin == true){
			System.out.println("You entered a valid email address");
		}
		
		else{
			System.out.println("Invalid Email Address!!!");
		}
	}
}
