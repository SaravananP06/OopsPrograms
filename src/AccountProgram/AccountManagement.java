package AccountProgram;

public class AccountManagement implements AccountInterface {

    private double totalBalance;
    /*
     * Initialization of the total balance.
     */
    public AccountManagement() {
        this.totalBalance = 100000;
    }
    /*
    Method to withdraw money
     */

    public void debit(double amount){
        if (amount > totalBalance){
            System.out.println("Sorry you don't have sufficient balance to withdraw money");
            System.out.println("Your account balance is "+ totalBalance);
        }else {
            totalBalance -= amount;
            System.out.println("Withdraw amount "+amount+" Your balance is "+totalBalance);
        }
    }
    /*
    Method to display the balance
     */
    public void display(){

        System.out.println("Your available balance is "+ totalBalance);
    }
}
