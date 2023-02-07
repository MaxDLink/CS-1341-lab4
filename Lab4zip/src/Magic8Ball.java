import java.util.Scanner; //imports scanner 
import java.util.Random; //imports random 
public class Magic8Ball {//start of class Magic8Ball

	public static void main(String[] args) {//start of main method; code starts here when it runs 
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in); //creates scanner 
		System.out.print("I AM THE MAGIC 8 BALL"); //welcome message 
		System.out.println(); //return 1 for formatting 
		System.out.println(); //return 2 for formatting 
		System.out.println(); //return 3 for formatting 
		System.out.println(); //return 4 for formatting 
		
		while(true) {//start of while true loop that loops the question forever unless the break condition is reached
			
			System.out.print("Ask me a question about your future: "); //prompt for user to ask question 
			String answer = input.nextLine(); //stores user's string input 
			
				if(answer.equals("")) {//start of if statement for no characters 
				break; //breaks out of the loop 
				
				}//end if 
				else //else if for false statement 
					getAnswer(); //get answer method called by reference 
				
					}//end while true loop 
				
				
	}//end main method 
		
	public static void getAnswer() {//start of getAnswer method 
		Random rand = new Random(); //creates random 
		Boolean trueOrFalse = rand.nextBoolean(); //generates a random true or false statement based on random 
		//stores all the 20 8ball responses in a string 
		String response[] = {"Reply hazy", "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful", "It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Yes", "Signs point to yes"}; //array for the 20 string responses 
		double randNum = rand.nextDouble(); //generates a random integer 

		randNum *= 20; //broadens the range from 0-19 decimal values 
		int randInt = (int) randNum; //truncates random value to integers from 0-19 
		
		String magic8BallSpeaks = response[randInt]; //retrieves content from response array randomly from 0-19 integer range 
		
		System.out.printf("%s", magic8BallSpeaks); //prints random response from response array 
		System.out.println(); //carriage return line feed for formatting 
		
				
	}//end of getAnswer method 

}//end class Magic8Ball
