
package  com.nguemechieu;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Account {


    private int id ;
    private double balance ;
    private double annualInterestRate;
    private Date dateCreated;
    private String customerName;
    // List of Transaction is static ,because to track every record
    private static List<Transaction> transactionsList ;
    private double withdrawAmount=0;

    private double depositAmount;

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }


    public double getAnnualInterestRate() {
        return annualInterestRate;
    }


    public List<Transaction> getTransactionsList() {
        if (transactionsList == null) {
            transactionsList = new ArrayList<>();
            return transactionsList;
        }
        return transactionsList;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + getDateCreated() +
                ", customerName='" + customerName + '\'' +
                ", withdrawAmount=" + withdrawAmount +
                ", depositAmount=" + depositAmount +
                '}';
    }

    public Account(String customerName  , int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
        this.customerName = customerName;
    }

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
        customerName = null;

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (this.getAnnualInterestRate() / 12);
    }

    public double getMonthlyInterest() {
        return (getBalance() * getMonthlyInterestRate() / 100);
    }



    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public double totalBalance() {
        balance = balance + getMonthlyInterest();
        return balance;
    }

    // withdraw method returned withdrawAmount and add transaction to a list
    protected double withdraw(double withdrawAmount) {

        this. withdrawAmount=withdrawAmount;

        this.setBalance(this.getBalance() - withdrawAmount);

        Date transactionDate = new Date();
        char transactionType = 'w';
        double remainingBalance = this.getBalance();

        String description = "You withdraw the amount of $" + withdrawAmount;
        if (getBalance()<0){

            System.out.println("Your account is overdraw!");
        }
        Transaction transaction = new Transaction(
                transactionDate,
                transactionType,
                withdrawAmount,
                remainingBalance,
                description);

        List<Transaction> list = getTransactionsList();
        list.add(transaction);//add transaction to list
        return this.getBalance();
    }


    protected double deposit(double depositAmount) {//Deposit method return deposited amount and add transaction to a list

        this.depositAmount=depositAmount;
        this.setBalance(this.getBalance() + depositAmount);//set balance
        Date transactionDate = new Date();

        char transactionType = 'D';
        double remainingBalance = this.getBalance();

        String description = "You deposited the amount of  $" + depositAmount;
        //Create a transaction after deposit
        Transaction transaction = new Transaction(transactionDate, transactionType,
                depositAmount, remainingBalance, description);
        List<Transaction> list = getTransactionsList();
        list.add(transaction);//adding each transactions in the list
        return this.getBalance();
    }
}