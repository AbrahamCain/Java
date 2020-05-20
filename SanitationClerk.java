/*
Sanitation Clerk 1.0
This program sanitzes user input
*/

import java.util.Scanner;
import java.lang.*;

public class SanitationClerk{
	public static void main(String[] args){
		
		//initialize the StringBuilder and Scanner
		StringBuilder sb1 = new StringBuilder();
		Scanner input = new Scanner(System.in);
		
		//Capture user input to a string and a char[]
		System.out.println("Please Enter Your Text:");
		String output = input.nextLine();
		char[] array = output.toCharArray();
		
		
		//loop through the elements in the char[] and filter out the unwanted characters
		//save the rest to the string
		System.out.println();
		for (int i = 0; i < array.length; i++){
			if (array[i] != '\'' && array[i] != '_' && array[i] != '@' && array[i] != '#' && array[i] != '%'){
			    sb1.append(array[i]);
			}
		}
		
		//show the results of the filtering
		System.out.println(sb1);
	}
}
