package com.nguemechieu;






//Course Code: CSC164-6C1 Computer Science II
//Author: Kirin Stevens, Noel Martial Nguemechieu
//Submission Type: Project1C
//Due Date:

//Description:
import java.util.*;
//Main class
    public class NewAccount extends Account {


    //Main method
    public static void main(String[] args) {

// Create an Account object
        Account account = new Account("George", 1122, 1000);

        // Set annual interest rate to 1.5%
        account.setAnnualInterestRate(1.5);

        // Deposit $30, $40, and $50 to the account
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        // withdraw $5, $4, and $2 from the account
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        // Print an account summary
        System.out.println("       Account Summary ");
        System.out.println("------------------------------------");
        System.out.println("Account holder name: " + account.getCustomerName());
        System.out.println("Interest rate: " + account.getAnnualInterestRate());
        System.out.printf("Balance: $%.2f\n", account.getBalance());
        System.out.println("\n     List of all transactions");
        System.out.println("------------------------------------");
        for (int i=0;i<account.getTransactionsList().size();i++) {
            System.out.println("Date: " + account.getDateCreated());
            System.out.println("Type: " + (account.getTransactionsList()).get(i).getType());
            System.out.println("Amount: " + (account.getTransactionsList()).get(i).getBalance());
            System.out.println("Balance: " + (account.getTransactionsList()).get(i).getBalance());
            System.out.println("Description: " + (account.getTransactionsList()).get(i).getDescription());
            System.out.println();
        }
    }






    @Override
    public double getWithdrawAmount() {
        return super.getWithdrawAmount();
    }

    @Override
    public void setWithdrawAmount(double withdrawAmount) {
        super.setWithdrawAmount(withdrawAmount);
    }

    public double getDepositAmount() {
        return super.getDepositAmount();
    }

    @Override
    public void setDepositAmount(double depositAmount) {
        super.setDepositAmount(depositAmount);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public Date getDateCreated() {
        return super.getDateCreated();
    }

    @Override
    public void setDateCreated(Date dateCreated) {
        super.setDateCreated(dateCreated);
    }

    @Override
    public String getCustomerName() {
        return super.getCustomerName();
    }

    @Override
    public void setCustomerName(String customerName) {
        super.setCustomerName(customerName);
    }

    @Override
    public double totalBalance() {
        return super.totalBalance();
    }

    @Override
    protected double withdraw(double withdrawAmount) {
        return super.withdraw(withdrawAmount);
    }

    @Override
    protected double deposit(double depositAmount) {
        return super.deposit(depositAmount);
    }

}



