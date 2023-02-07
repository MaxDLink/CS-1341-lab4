import java.util.Scanner; //imports scanner from java library 
import java.util.Random;  //imports random from java library 

public class PassRun2 {//start of class PassRun2

	static Scanner input = new Scanner (System.in); //creates static scanner that can be used across all methods 
	static Random rand = new Random(); //creates a static Random operator that can be used across all methods 
	
	public static void main(String[] args) {//start of main 
		
		int currentLocation = 20; //integer variable that holds current 20 yard line location 
		System.out.printf("At location %d.", currentLocation); //prints a message displaying current location 
		
		
		while(true) {//start of while true loop 
			System.out.print("Pass, Run, or Quit (P/R/Q)? "); //prompts the user to pass, run, or quit 
			String userInput = input.nextLine(); //takes the user input and considers multiple lines
			
			
			while(true) {//start of inner while loop check 
			
		
				
			if(userInput.equalsIgnoreCase("P") || userInput.equalsIgnoreCase("R") || userInput.equalsIgnoreCase("Q")){//start of if that breaks while true loop 
				break;
			}//end of if
			else
				System.out.print("Invalid Entry!\n");
				//repeat prompt here 
				/*display current location also*/ System.out.printf("At location %d. Pass, Run, or Quit (P/R/Q)? ", currentLocation); //prompts the user to pass, run, or quit 
				userInput = input.nextLine(); //takes the user input and considers multiple lines FIXED MULTIPLE LINE READING 
			}//end while true loop 
			if(userInput.equalsIgnoreCase("Q")){//start of if that breaks while true loop 
				break; 
			}//end of break if 
			else {//start of else method that passes R and Q into getYardsMoved method 
				int getYardsValue = getYardsMoved(userInput); //calls the getYardsMoved method and passes in userInput and stores return into an int
				if(getYardsValue<0) {
					getYardsValue = 0; //sets getYardsValue to zero if its less than zero 
				}
				int newLocation = currentLocation - getYardsValue; //updates location 
				if(newLocation >= 100) {
					getYardsValue = 100 - newLocation; 
					System.out.print("Touchdown!"); //displays touch down 
					System.out.printf("Moved %d yards. New location is %d\n",getYardsValue, currentLocation); //print statement displaying 100 - getYardsValue for yards moved and updated location back to 20 yards
				}
				else
				System.out.printf("Moved %d yards. New location is %d\n",getYardsValue, newLocation); //print statement displaying yards moved and updated location
				
				}//end of else 
				
		
			
		}//end outer while true 
		
	}//end main 
public static int getYardsMoved(String userInput) {//start getYardsMoved method and passes in userInput 
	int [] passValues = {10,-5,0,0,0,5,10,15,20,25}; //array containing pass values 
	int [] runValues = {5,-3,-1,1,2,4,5,6,8,9}; //array containing run values 
	double randNum = rand.nextDouble(); //creates a random integer from 0-1
	randNum*=10; //broadens the random integer from 0-9.9999
	int randInt = (int) randNum; //truncates to range 0-9 
	if(userInput.equalsIgnoreCase("P")) {//start of if that gets array value based on pass 
	int passRetrieve = passValues[randInt]; //randomly retrieve a number from passValues 
		if(passRetrieve<0) {
			System.out.print("Sacked!!\n"); //displays sacked if passRetrieve < 0
		}
		else if(passRetrieve == 0) {
			System.out.print("Missed Catch!!\n"); //displays missed if passRetrieve == 0 
		}
	return passRetrieve; //returns the random int in passRetrieve 
	}//end if 
	else {//start of else that gets array value based on run
	int runRetrieve = runValues[randInt]; //randomly retrieve a number from runValues 
	return runRetrieve; //returns the random int in runRetrieve 
	}//end of else 
	
	
	
	
}//end getYardsMoved method 

}//end class PassRun2

