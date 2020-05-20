public class MadLibs {
  /*
  This program creates a mad lib created 
  with variables that I selected randomly
  */
  	public static void main(String[] args){

      //Declare our variables for the mad lib
      String name1 = "Mankind", name2 = "Wilfred";
      String adjective1 = "fancy", adjective2 = "hot", adjective3 = "robotic";
      String verb1 = "whack";
      String noun1 = "dog", noun2 = "zombie", noun3 = "pot pie", noun4 = "dude", noun5 = "summer squash", noun6 = "after-shave";
      int number = 14;
      String place1 = "that alley over there";


      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      //Read the story
      System.out.println(story);
    }       
}
