package oopBankProject;

public class checkingAccount extends  bankAccount {


    public checkingAccount(int accountNumber, String accountHolder, int balance) {
        super(accountNumber, accountHolder, balance);

    }

    public void withDraw(checkingAccount account,int withDrawAmount){
        account.deposit(withDrawAmount);
    }

    public static void main(String[] args) {
        checkingAccount omerBorkluCheckingAccount= new checkingAccount(1234,"Omer Borklu", 555);
        omerBorkluCheckingAccount.showBalance();
        omerBorkluCheckingAccount.withDraw(omerBorkluCheckingAccount, -200);
        omerBorkluCheckingAccount.showBalance();
        omerBorkluCheckingAccount.deposit(5000);

    }

}
