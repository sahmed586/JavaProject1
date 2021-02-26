public class Test {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);

        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is " + account.getBalance());
        System.out.println("Monthly Interest is " + account.getMonthlyInterest());
        System.out.println("The Account was Created at " + account.getDateCreated());
    }
}

class Account
{
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;

    // no arg constructor - creates default acc
    public Account() {
        dateCreated = new java.util.Date();
    }

    // constructor w/ specified ID and balance
    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }

    // accessor and mutator for ID
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // accessor and mutator for balance
    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // accessor and mutator for annual interest rate 
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // accessor for the date created 
    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    // monthly interest rate method 
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }
    
    
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // withdraw method
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    // deposit method 
    public void deposit(double amount) {
        this.balance += amount;
    }
}
