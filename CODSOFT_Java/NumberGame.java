package CODSOFT_Java;

import java.util.Random;
import java.util.Scanner;

public class NumberGame
{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        
	        int roundsPlayed = 0;
	        int totalScore = 0;
	        boolean playAgain = true;
	        
	        System.out.println("Welcome to the Number Guessing Game!");

	        while (playAgain) {
	            int numberToGuess = random.nextInt(100) + 1; // Generate a random number between 1 and 100
	            int maxAttempts = 10;
	            int attempts = 0;
	            roundsPlayed++;

	            System.out.println("\nRound " + roundsPlayed);
	            System.out.println("I'm thinking of a number between 1 and 100. You have " + maxAttempts + " attempts to guess it.");
	            
	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                int userGuess;
	                
	                try {
	                    userGuess = Integer.parseInt(scanner.nextLine());
	                } catch (NumberFormatException e) {
	                    System.out.println("Please enter a valid number.");
	                    continue;
	                }
	                
	                attempts++;
	                
	                if (userGuess == numberToGuess) {
	                    System.out.println("Congratulations! You've guessed the correct number.");
	                    totalScore += (maxAttempts - attempts + 1); // Higher score for fewer attempts
	                    break;
	                } else if (userGuess < numberToGuess) {
	                    System.out.println("Your guess is too low.");
	                } else {
	                    System.out.println("Your guess is too high.");
	                }
	                
	                System.out.println("Attempts left: " + (maxAttempts - attempts));
	            }
	            
	            if (attempts == maxAttempts) {
	                System.out.println("Sorry, you've used all your attempts. The correct number was " + numberToGuess + ".");
	            }
	            
	            System.out.println("Your score: " + totalScore);
	            System.out.print("Do you want to play another round? (yes/no): ");
	            String response = scanner.nextLine().toLowerCase();
	            playAgain = response.equals("yes");
	        }

	        System.out.println("Thank you for playing! You played " + roundsPlayed + " rounds and your total score is " + totalScore + ".");
	        scanner.close();
	    }
	}


