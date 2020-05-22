//Program to display classes
import java.util.Scanner;

public class Character{
	
	//declare instance variables
	String characterName;
	String fightingStyle;
	boolean isGood;
	
	//Constructor Method
	public Character(String name, int style, boolean good){
		
		//set characterName and isGood = to the input funtion arguments in1 and in3
		characterName = name;
		isGood = good;
		
		//Evaluate which fighting style to use based off of the input function argument in2
		//We set "Noob" as a default for those who don't follow directions
		if (style == 1){
			fightingStyle = "Warrior";
		}
		else if (style == 2){
			fightingStyle = "Thief";
		}
		else if (style == 3){
			fightingStyle = "Mage";
		}
		else{
			fightingStyle = "Noob";
		}
		
	}
	
	public static void main(String[] args){
		//initiate scanner
		Scanner scan = new Scanner(System.in);
		
		//print banner message ASCII Art
		System.out.println("  ______  __    __       ___      .______          ___       ______ .___________. _______ .______          _______.\n /      ||  |  |  |     /   \\     |   _  \\        /   \\     /      ||           ||   ____||   _  \\        /       |\n|  ,----'|  |__|  |    /  ^  \\    |  |_)  |      /  ^  \\   |  ,----'`---|  |----`|  |__   |  |_)  |      |   (----`\n|  |     |   __   |   /  /_\\  \\   |      /      /  /_\\  \\  |  |         |  |     |   __|  |      /        \\   \\    \n|  `----.|  |  |  |  /  _____  \\  |  |\\  \\----./  _____  \\ |  `----.    |  |     |  |____ |  |\\  \\----.----)   |   \n \\______||__|  |__| /__/     \\__\\ | _| `._____/__/     \\__\\ \\______|    |__|     |_______|| _| `._____|_______/ \n\n");
		
		
		//ask for a character name
		System.out.println("\nPlease enter a character name:");
		String in1 = scan.nextLine();
		
		//ask for a fighting style
		System.out.println("\nPlease select a (number) Fighting Style from the following:\n1....Warrior\n2....Thief\n3....Mage");
		int in2 = scan.nextInt();
		scan.nextLine();
		
		//ask whether or not the character is good
		System.out.println("\nYour character is a good-guy. (true or false):");
		boolean in3 = scan.nextBoolean();
		
		
		//Create the characters with the options selected by the user or preset options
		Character yourCharacter = new Character(in1, in2, in3);

		Character badGuy1 = new Character("Sauron", 3, false);
		Character goodGuy1 = new Character("Gandalf", 3, true);
		Character badGuy2 = new Character("Gollum", 2, false);
		Character goodGuy2 = new Character("Samwise", 10, true);
		
		//Greet the new character
		System.out.println("\n\nHello " + yourCharacter.characterName + ". Welcome to the " + yourCharacter.fightingStyle + "'s Guild. If I told you that you were a good-guy, that would be " + yourCharacter.isGood + "."); 

		
		//Ask who you would like to know more about
		System.out.println("\n\nChoose who you would like to know more about:\n\n1....Bad Guy #1\n2....Bad Guy #2\n3....Good Guy #1\n4....Good Guy #2\n");
		int view = scan.nextInt();
		
		//set the alignment variable with a default of bad
		String alignment = "bad";
	
		
		//depending on who the user selects, display the appropriate message and info
		if (view == 1){
			if (badGuy1.isGood){
			alignment = "good";
			}
			System.out.println(badGuy1.characterName + " is a " + alignment + " " + badGuy1.fightingStyle);
		}
		else if (view == 2){
			if (badGuy2.isGood){
			alignment = "good";
			}
			System.out.println(badGuy2.characterName + " is a " + alignment + " " + badGuy2.fightingStyle);
		}
		else if (view == 3){
			if (goodGuy1.isGood){
			alignment = "good";
			}
			System.out.println(goodGuy1.characterName + " is a " + alignment + " " + goodGuy1.fightingStyle);
		}
		else if (view == 4){
			if (goodGuy2.isGood){
			alignment = "good";
			}
			System.out.println(goodGuy2.characterName + " is a " + alignment + " " + goodGuy2.fightingStyle);
		}
		
	}
}
