package CODSOFT_Java;

import java.util.Scanner;

public class ATM {
	
	
			// Class to represent the ATM machine
		    private BankAccount account;

		    // Constructor to initialize the ATM with a BankAccount object
		    public ATM(BankAccount account) {
		        this.account = account;
		    }

		    // Method to display the ATM menu and handle user interaction
		    public void start() {
		        Scanner scanner = new Scanner(System.in);
		        boolean exit = false;

		        System.out.println("Welcome to the ATM!");

		        while (!exit) {
		            System.out.println("\nPlease choose an option:");
		            System.out.println("1. Check Balance");
		            System.out.println("2. Deposit");
		            System.out.println("3. Withdraw");
		            System.out.println("4. Exit");

		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    // Check balance
		                    System.out.println("Your current balance is: Rs" + account.getBalance());
		                    break;
		                case 2:
		                    // Deposit
		                    System.out.print("Enter amount to deposit: ");
		                    double depositAmount = scanner.nextDouble();
		                    account.deposit(depositAmount);
		                    break;
		                case 3:
		                    // Withdraw
		                    System.out.print("Enter amount to withdraw: ");
		                    double withdrawAmount = scanner.nextDouble();
		                    account.withdraw(withdrawAmount);
		                    break;
		                case 4:
		                    // Exit
		                    exit = true;
		                    System.out.println("Thank you for using the ATM. Goodbye!");
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please choose a valid option.");
		            }
		        }

		        scanner.close();
		    }

		    // Main method to run the ATM program
		    public static void main(String[] args) {
		        // Create a bank account with an initial balance
		        BankAccount myAccount = new BankAccount(1000.00); // Example initial balance
		        // Create an ATM object with the bank account
		        ATM atm = new ATM(myAccount);
		        // Start the ATM
		        atm.start();
		    }
		
}
