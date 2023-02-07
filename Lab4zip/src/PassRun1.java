import java.util.Scanner; //imports scanner from java library 
import java.util.Random;  //imports random from java library 

public class PassRun1 {//start of class PassRun1

	static Scanner input = new Scanner (System.in); //creates static scanner that can be used across all methods 
	static Random rand = new Random(); //creates a static Random operator that can be used across all methods 
	
	public static void main(String[] args) {//start of main 
		
		int currentLocation = 20; //integer variable that holds current 20 yard line location 
		System.out.printf("Starting at the %d yard line\n", currentLocation); //prints a message displaying current location 
		
		while(true) {//start of while true loop 
			
			System.out.print("Pass, Run, or Quit (P/R/Q)? "); //prompts the user to pass, run, or quit 
			String userInput = input.nextLine(); //takes the user input and considers multiple lines 
			
			if(userInput.equalsIgnoreCase("Q")){//start of if that breaks while true loop 
				break; 
			}//end of break if 
			else {//start of else method that passes R and Q into getYardsMoved method 
				int getYardsValue = getYardsMoved(userInput); //calls the getYardsMoved method and passes in userInput and stores return into an int
				int newLocation = currentLocation - getYardsValue; //updates location 
				System.out.printf("Moved %d yards. New location is %d\n",getYardsValue, newLocation); //print statement displaying yards moved and updated location
				 
				}//end of else 
				
		}//end while true loop 
		
	}//end main 
public static int getYardsMoved(String userInput) {//start getYardsMoved method and passes in userInput 
	int [] passValues = {10,-5,0,0,0,5,10,15,20,25}; //array containing pass values 
	int [] runValues = {5,-3,-1,1,2,4,5,6,8,9}; //array containing run values 
	double randNum = rand.nextDouble(); //creates a random integer from 0-1
	randNum*=10; //broadens the random integer from 0-9.9999
	int randInt = (int) randNum; //truncates to range 0-9 
	if(userInput.equalsIgnoreCase("P")) {//start of if that gets array value based on pass 
	int passRetrieve = passValues[randInt]; //randomly retrieve a number from passValues 
	return passRetrieve; //returns the random int in passRetrieve 
	}//end if 
	else {//start of else that gets array value based on run
	int runRetrieve = runValues[randInt]; //randomly retrieve a number from runValues 
	return runRetrieve; //returns the random int in runRetrieve 
	}//end of else 
	
	
	
	
}//end getYardsMoved method 

}//end class PassRun1
