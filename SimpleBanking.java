package banking;
import java.util.Scanner;
public class SimpleBanking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Set your account PIN: ");
        String pin = scanner.nextLine();
        Account account = new Account(pin);

        boolean exit = false;

        while (!exit) {
            System.out.println("\nBanking Application:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Exit");

            System.out.print("Choose an option (1-6): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    account.displayTransactionHistory();
                    break;
                case 5:
                    System.out.print("Enter interest rate (in %): ");
                    double rate = scanner.nextDouble();
                    account.calculateInterest(rate);
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }

        scanner.close();
    }
}
