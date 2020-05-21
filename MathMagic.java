public class MathMagic {
	public static void main(String[] args) {
    //Change this input number to any almost any other int number and you will get the same result 
    int myNumber = 24;

	  int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

    //print final value which is almost always 3
    System.out.println(stepSix);

	}
}
