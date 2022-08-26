package AccountProgram;
/*
This program is to make debit money from an Account.
If user exceed the balance amount the money will not get withdraw
 */
import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountManagement accountDetails = new AccountManagement();
        accountDetails.display();
        System.out.println("Enter the amount to withdraw");
        double amount = sc.nextDouble();
        accountDetails.debit(amount);

    }

}
