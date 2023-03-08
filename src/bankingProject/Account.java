package bankingProject;

import java.util.Scanner;

public class Account {

	// class variables
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;

	public Account(String cname, String cid) {
		customerName = cname;
		customerID = cid;
	}

	public void deposit(int amount) {
		balance = balance + amount;
		previousTransaction = amount;
	}

	public void withdraw(int amount) {
		balance -= amount;
		previousTransaction = -amount;
	}

	void prev() {
		if (previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		} else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occurred");
		}
	}

	void calculateInterest(int years) {
		double interestRate = .0185;
		double newBalance = (balance * interestRate * years) + balance;
		System.out.println("The current interest rate is " + (100 * interestRate) + "%");
		System.out.println("After " + years + " years, you balance will be: " + newBalance);
	}

	public void showMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("what would you like to do?\n");
		System.out.println("A. Check your balance");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdrawal");
		System.out.println("D. View previous transaction");
		System.out.println("E. Calculate interest");
		System.out.println("F. Exit");

		char ch;
		do {
			System.out.println("Enter an option:");
			ch = sc.next().charAt(0);
			switch (ch) {
			case 'A': {
				System.out.println(balance);
				System.out.println();
				break;
			}

			case 'B': {
				System.out.println("Enter an amount to deposit: ");
				int amount = sc.nextInt();
				deposit(amount);
				System.out.println();
				break;
			}

			case 'C': {
				System.out.println("Enter an amount to withdraw::");
				int amount = sc.nextInt();
				withdraw(amount);
				System.out.println();
				break;
			}

			case 'D': {
				System.out.println();
				prev();
				System.out.println();
				break;
			}

			case 'E':
				System.out.println("Enter how many years of accrued interest: ");
				int years = sc.nextInt();
				calculateInterest(years);
				break;
				
			// Case 'F' exits the user from their account
			case 'F':
				System.out.println("====================================");
				break;
			// The default case let's the user know that they entered an invalid character
			// and how to enter a valid one
				
			default:
				System.out.println("Error: invalid option. Please enter A, B, C, D, or E or access services.");
				break;
			}

		} while (ch != 'F');
		System.out.println("Thank you for banking with us!");
	}
}
