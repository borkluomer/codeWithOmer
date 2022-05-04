package oopBankProject;

public class bankAccount {

    //Task BankAccount
    //create a class called BankAccount
    //    variables: accountNumber, accountHolder, Balance
    //    methods: deposit, showBalance, toString

    private long accountNumber;
    private String accountHolder;
    private static double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        bankAccount.balance = balance;
    }

    public bankAccount(int accountNumber, String accountHolder, int balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;

    }

    public void deposit(int deposit){
        this.balance = balance+deposit;
    }

    public void showBalance(){
        System.out.println("Balance is " +balance + " for Omer Borklu");
    }

    public String toString(){return "This acct number "+accountNumber+
            "belongs to " + accountHolder + "with this balance of "+balance;  }



}
