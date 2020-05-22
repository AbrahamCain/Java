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
		
		
		//Create the character with the options selected by the user
		Character yourCharacter = new Character(in1, in2, in3);
		
		
		//Greet the new character
		System.out.println("\n\nHello " + yourCharacter.characterName + ". Welcome to the " + yourCharacter.fightingStyle + "'s Guild. If I told you that you were a good-guy, that would be " + yourCharacter.isGood + "."); 
	}
}
