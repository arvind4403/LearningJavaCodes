import java.io.File;

public class BankAccount {
    private final int accountNumber;
    private String accountHolderName;
    private double accountBalance;
    public BankAccount(int accountNumber , String accountHolderName , double accountBalance){
        this.accountNumber= accountNumber;
        this.accountHolderName=accountHolderName;
        this.accountBalance=accountBalance;
    }
    public void deposit(double amount){
        accountBalance +=amount;
    }
    public void withdraw(double amount){
        if(amount <= accountBalance){
            accountBalance -=amount;
        }
    }
    public void displayAccountInformation(){
        System.out.println("The account number: " + accountNumber);
        System.out.println("The account holder name : "+ accountHolderName);
        System.out.println("Account balance: "+ accountBalance);

    }
    public void main(String args[]){
        BankAccount account = new BankAccount(12345, "rahul", 5000);
        account.deposit(500.0);
        account.withdraw(100.0);
        account.displayAccountInformation();
    }
}
