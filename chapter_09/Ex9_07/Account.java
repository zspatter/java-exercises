/**
 * Zachary Patterson
 * Lab 1
 * 2019-01-26
 * INFO 211
 */

import java.util.Date;

public class Account
{
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    public Account()
    {
        this(0, 0);
    }

    public Account(int id, double balance)
    {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new java.util.Date();
    }

    // line 30-64 are accessors and mutators for the class
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public static double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    // sets the annual interest rate for all accounts
    public static void setAnnualInterestRate(double annualInterestRate)
    {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated()
    {
        return dateCreated;
    }

    // converts annualInterestRate to decimal representation,
    // then divides by 12 to get monthly interest rate
    public double getMonthlyInterestRate()
    {
        return annualInterestRate / 100 / 12;
    }

    // multiplies monthly interest rate by the balance to get monthly interest paid
    public double getMonthlyInterest()
    {
        return getMonthlyInterestRate() * balance;
    }

    // if the withdrawal amount is negative, the transaction is cancelled
    // if the funds in balance are less than the withdrawal amount, an error message is printed
    // and the transaction is cancelled
    // otherwise, the transaction is processed (deducting the withdraw amount from balance)
    public void withdraw(double withdrawAmount)
    {
        if (withdrawAmount < 0)
            System.out.println("The withdrawal amount must be a positive value. Cannot complete transaction.");
        else if (withdrawAmount > balance)
            System.out.println("The withdrawal amount is greater than the account balance. Cannot complete transaction.");
        else
        {
            this.balance -= withdrawAmount;
            System.out.printf("$%3.2f has been withdrawn.\tCurrent balance: $%3.2f\n", withdrawAmount, balance);
        }
    }

    // if the deposit amount is negative, the transaction is cancelled
    // otherwise, the transaction is processed (adding the deposit amount to the balance)
    public void deposit(double depositAmount)
    {
        if (depositAmount < 0)
            System.out.println("The deposit amount must be a positive value. Cannot complete transaction.");
        else
        {
            this.balance += depositAmount;
            System.out.printf("$%3.2f has been deposited.\tCurrent balance: $%3.2f\n", depositAmount, balance);
        }
    }
}
