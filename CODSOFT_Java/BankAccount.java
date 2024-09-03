package CODSOFT_Java;
import java.util.Scanner;
public class BankAccount {

	// Class to represent the user's bank account
		    private double balance;

	    // Constructor to initialize the bank account with an initial balance
	    public BankAccount(double initialBalance) {
	        if (initialBalance >= 0) {
	            this.balance = initialBalance;
	        } else {
	            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
	            this.balance = 0;
	        }
	    }

	    // Method to deposit money into the account
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful. Current balance: Rs" + balance);
	        } else {
	            System.out.println("Invalid deposit amount. Please enter a positive value.");
	        }
	    }

	    // Method to withdraw money from the account
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawal successful. Current balance: Rs" + balance);
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance. Current balance: Rs" + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount. Please enter a positive value.");
	        }
	    }

	    // Method to check the current balance
	    public double getBalance() {
	        return balance;
	    }
	}

	


