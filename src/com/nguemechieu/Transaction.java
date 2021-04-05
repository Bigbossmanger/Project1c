package com.nguemechieu;
import java.util.Date;
public class Transaction {
    private  double transactionAmount;
    private Date transactionDate;
    private  char type='w';

    private double balance=0;
    private String description="none";


//Default constructor
    public Transaction() {

    }

    //Constructor with parameters
    public Transaction(Date transactionDate, char type, double transactionAmount, double balance, String description) {
        this();
        this.transactionDate = transactionDate;
        this.type = type;
        this.transactionAmount=transactionAmount;
        this.balance = balance;
        this.description = description;
    }


    //Get transaction date
    public Date getTransactionDate() {
        return transactionDate;
    }

 //Get transaction type
    public char getType() {
        return type;
    }
    //Get  new Balance
    public double getBalance() {
        return balance;

    }

    //Get description
    public String getDescription() {
        return description;
    }


    @Override
    public String toString() {
        return "Transaction: " + getTransactionDate() +
                ", Type :" + getType() +
                ", amount :" +getTransactionAmount()+
                ", balance : " + getBalance() +
                ", description :'" + getDescription() ;
    }

//Get transaction amount
    public double getTransactionAmount() {
        return transactionAmount;
    }

}