package num.com;
import java.util.Random;
import java.util.Scanner;

	public class GuessTheNumber 
	{

	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int lowerBound = 1;
	        int upperBound = 100;
	        int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
	        int attempts = 0;
	        int score = 100;

	        System.out.println("\n*****************************Welcome to the Guess the Number game!"
	        		+ "*******************************************");
	        System.out.println("\n I've selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

	        while (true) 
	        {
	            System.out.print("\n Enter your guess         : ");
	            int userGuess = scanner.nextInt();
	            attempts++;

	            if (userGuess == targetNumber) 
	            {
	            	System.out.println("");
	                System.out.println("Congratulations! You've guessed the correct number  : " + targetNumber);
	                System.out.println(" \n Your score   : " + score);
	                break;
	            } else if (userGuess < targetNumber) {
	                System.out.println("Try again. The number is higher.\n");
	            } else 
	            {
	                System.out.println("Try again. The number is lower.\n ");
	            }

	            // Decrease the score by 5 for each attempt.
	            score -= 5;

	            if (score <= 0)
	            {
	                score = 0;
	                System.out.println("\n Game over! You've run out of attempts. The correct number was  : " + targetNumber);
	                break;
	            }
	        }

	        System.out.println("\n Game over...................! \n \n You took " + attempts + "  attempts to guess the number.");
	        scanner.close();
	    }
	}


