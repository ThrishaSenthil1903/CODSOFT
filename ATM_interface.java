package com.ATM;
import java.util.Scanner;

 class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n--- ATM Interface ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println(" Current Balance: " + account.getBalance());
                    break;

                case "2":
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = readAmount();
                    if (account.deposit(depositAmount)) {
                        System.out.println(depositAmount + " deposited successfully.");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case "3":
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = readAmount();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("" + withdrawAmount + " withdrawn successfully.");
                    } else {
                        System.out.println(" Withdrawal failed. Check amount or balance.");
                    }
                    break;

                case "4":
                    System.out.println(" Thank you for using the ATM. Goodbye!");
                    return;

                default:
                    System.out.println("Invalid selection. Please choose a valid option.");
            }
        }
    }

    private double readAmount() {
        try {
            return Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}
	class BankAccount {
	    private double balance;

	    public BankAccount(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public boolean deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            return true;
	        }
	        return false;
	    }

	    public boolean withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            return true;
	        }
	        return false;
	    }

	    public double getBalance() {
	        return balance;
	    }
	}
	
		public class ATM_interface {
		    public static void main(String[] args) {
		        BankAccount myAccount = new BankAccount(1000.0); 
		        ATM myATM = new ATM(myAccount);
		        myATM.start();
		    }
		}


