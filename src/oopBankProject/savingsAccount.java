package oopBankProject;

public class savingsAccount extends bankAccount {

    double interestRate;

    public savingsAccount(int accountNumber, String accountHolder, int balance) {
        super(accountNumber, accountHolder, balance);
    }

    public static void main(String[] args) {
        savingsAccount omerBorkluSavings=new savingsAccount(1234567,"Omer Borklu",5000);
        omerBorkluSavings.showBalance();
        omerBorkluSavings.deposit(550);
        omerBorkluSavings.toString();
        omerBorkluSavings.showBalance();
    }

}
