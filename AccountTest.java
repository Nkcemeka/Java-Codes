import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // Create two Account objects

            Account account1 = new Account("Jane Green", 50.0);
            Account account2 = new Account("John Blue", -7.53);

            // display initial balance of each object
            System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
            System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());
            
            // Create a scanner to obtain input from command window
            Scanner input = new Scanner(System.in);

            System.out.print("Enter deposit number for account1: ");
            double depositAmount = input.nextDouble(); // obtain User
            System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
            account1.deposit(depositAmount);

            // display balances
            System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
            System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

            System.out.print("Enter deposit number for account2: ");
            depositAmount = input.nextDouble(); // obtain User
            System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
            account2.deposit(depositAmount);

            System.out.printf("%s balance: $%.2f%n",
                account1.getName(), account1.getBalance());
            System.out.printf("%s balance: $%.2f%n",
                account2.getName(), account2.getBalance());
    }
}
