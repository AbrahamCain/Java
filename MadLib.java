import java.util.Scanner;

public class MadLib2 {
  /*
  This program creates a mad lib 
  with variables that you select!
  
  MadLib 2.0
  */
  	public static void main(String[] args){
		
	  //Make the scanner object
	  Scanner input = new Scanner(System.in);
		


    //Use user input to fill in the blanks for the story
	  System.out.println("Please enter a name:");			
    String name1 = input.nextLine();						
	  
	  System.out.println("Please enter a 2nd name:");		
	  String name2 = input.nextLine();
	  
	  System.out.println("Please enter an adjective:");		
    String adjective1 = input.nextLine();
	  
	  System.out.println("Please enter a 2nd adjective:");	
	  String adjective2 = input.nextLine();

	  System.out.println("Please enter a 3rd adjective:");	
	  String adjective3 = input.nextLine();
	  
	  System.out.println("Please enter a verb:");
    String verb1 = input.nextLine();
	  
	  System.out.println("Please enter a noun:");
    String noun1 = input.nextLine();

	  System.out.println("Please enter a 2nd noun:");
	  String noun2 = input.nextLine();

	  System.out.println("Please enter a 3rd noun:");
	  String noun3 = input.nextLine();

	  System.out.println("Please enter a 4th noun:");
	  String noun4 = input.nextLine();

	  System.out.println("Please enter a 5th noun:");
	  String noun5 = input.nextLine();

	  System.out.println("Please enter a 6th noun:");
	  String noun6 = input.nextLine();
	  
	  System.out.println("Please enter a number:");
    int number = input.nextInt();
	  
	  System.out.println("Please enter a place:");
    String place1 = input.nextLine();



      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      //Read the story
      System.out.println(story);
    }       
}
