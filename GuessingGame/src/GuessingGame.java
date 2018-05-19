import java.util.Scanner;



public class GuessingGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// create a random number from 1 - 100 
		int theNumber = (int)(Math.random()*100+1);
		// guessing number
		int guess = 0; 
		
		while (guess != theNumber) {
			System.out.println("Guess a number between 1 and 100.");
		    //Get the users guess
			guess = scan.nextInt();
			
			if(guess < theNumber)
				System.out.println(guess + " is too low. Please try again.");
			else if(guess > theNumber)
				System.out.println(guess + " is too high. Please try again.");
			else
				System.out.println(guess + " is correct! You win!");
			
		}
			
	}

}
