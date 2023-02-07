import java.util.Scanner; //imports scanner 
import java.util.Random; //imports random 
public class Wizard {//start of class wizard 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Omniscient Wizard\n\n"); //prints omniscient wizard header
		
		while(true) {
			
			Scanner input = new Scanner(System.in); //creates scanner 
			Random rand = new Random(); //creates random 
			Boolean trueOrFalse = rand.nextBoolean(); //generates a random true or false statement based on random 
		
			
			System.out.print("Ask me any yes/no question: "); //prompt user for yes/no question 
			String answer = input.nextLine(); //stores user's string input 
		
				if(answer.equals("")) {//start of if statement for no characters 
				break; 
				}//end if 
				else if(trueOrFalse == true)//else if for false statement 
					System.out.print("Yes!\n"); //prints yes based on true 
				else if(trueOrFalse == false)
					System.out.print("No.\n"); //prints no based on false
				
			
			
			}//end while true loop 

				}//end main  
	
					}//end class Wizard 

