import java.util.Scanner;



public class GuessingGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//play again String
		String playAgain = "";
		
		//game loop
		do{
		
		
				// create a random number from 1 - 100 
				int theNumber = (int)(Math.random()*100+1);
				// guessing number
				int guess = 0; 
				
				// variable to hold the number of tries of a user
				int numOfTries = 0; 
				
				while (guess != theNumber) {
					System.out.println("Guess a number between 1 and 100.");
				    //Get the users guess
					guess = scan.nextInt();
					// Add 1 to the number of tries 
					numOfTries++;
					
					if(guess < theNumber)
						System.out.println(guess + " is too low. Please try again.");
					else if(guess > theNumber)
						System.out.println(guess + " is too high. Please try again.");
					else
						System.out.println(guess + " is correct! You win!");
					
				
				} // end of while loop for guessing 
				System.out.println("It only took you " + numOfTries + " tries! Good work!");
		// ask for 'y' to play again
				System.out.println(" Would you like to play again (y/n) ? ");
		        playAgain = scan.next();
		        
		 } while(playAgain.equalsIgnoreCase("y"));
		  System.out.println("Thank you for playing. Goodbye!");
		
				
	}

}
