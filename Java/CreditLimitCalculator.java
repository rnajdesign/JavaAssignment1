import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            while (true) {
                // Prompt for account number
                System.out.print("Enter account number (or -1 to quit): ");
                int accountNumber = input.nextInt();
                
                if (accountNumber == -1) {
                    break;  // Sentinel value to end loop
                }
                
                // Input customer data
                System.out.print("Enter beginning balance: ");
                int beginningBalance = input.nextInt();
                
                System.out.print("Enter total charges: ");
                int charges = input.nextInt();
                
                System.out.print("Enter total credits: ");
                int credits = input.nextInt();
                
                System.out.print("Enter credit limit: ");
                int creditLimit = input.nextInt();
                
                // Calculate new balance
                int newBalance = beginningBalance + charges - credits;
                
                // Display results
                System.out.println("Account Number: " + accountNumber);
                System.out.println("New Balance: " + newBalance);
                
                if (newBalance > creditLimit) {
                    System.out.println("Credit limit exceeded.\n");
                } else {
                    System.out.println("Within credit limit.\n");
                }
            }
            
            System.out.println("Finished processing customers.");
        }
    }
}
