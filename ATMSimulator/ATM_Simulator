

import java.util.Scanner;
public class atmsimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000; // Starting balance
        int choice;

        int pin = 6332;
        int attempts = 0;
        boolean authenticated = false;
        StringBuilder history = new StringBuilder();

        while (attempts < 3) {
            System.out.println("Enter your 4-digit PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == pin) {
                System.out.println("PIN verified. Access Granted.");
                authenticated = true;
                break;
            } else {
                attempts ++;
                System.out.println("Incorrect PIN. " + (3 - attempts) + " left. ");
            }

        }
        if (!authenticated) {
            System.out.println("Too many incorrect attempts. Card blocked.");
            return; // Exit the program
        }
        while (true) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("5. View Transaction History");
            System.out.println("enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited successfully.");
                        System.out.println("New Balance: " + balance);
                        history.append("Deposited: ₹").append(deposit).append("\n");
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdraw successful.");
                        System.out.println("Remaining balance: " + balance);
                        history.append("Withdraw: ₹").append(withdraw).append("\n");
                    } else {
                        System.out.println("Invalid or insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    return;
                case 5:
                    System.out.println("---- Transaction History ----");
                    if (history.length() == 0) {
                        System.out.println("No transactions yet.");
                    } else {
                        System.out.println(history.toString());
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

