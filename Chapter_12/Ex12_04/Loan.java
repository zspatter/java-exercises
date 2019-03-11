/**
 * Ex12_04
 */
public class Loan
{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    /**
     * Default constructor
     */
    public Loan()
    {
        this(2.5, 1, 1000);
    }

    /**
     * Construct a loan with specified annual interest rate,
     * 13 number of years, and loan amount
     * 14
     */
    public Loan(double annualInterestRate, int numberOfYears,
                double loanAmount) throws IllegalArgumentException
    {
        if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0)
            throw new IllegalArgumentException("The attributes must be greater than zero.");
        else
        {
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
            loanDate = new java.util.Date();
        }
    }

    /**
     * Return annualInterestRate
     */
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    /**
     * Set a new annualInterestRate
     */
    public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException
    {
        if (annualInterestRate <= 0)
            throw new IllegalArgumentException("Annual interest rate must be greater than 0. The value passed was " + annualInterestRate);
        else
            this.annualInterestRate = annualInterestRate;
    }

    /**
     * Return numberOfYears
     */
    public int getNumberOfYears()
    {
        return numberOfYears;
    }

    /**
     * Set a new numberOfYears
     */
    public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException
    {
        if (numberOfYears <= 0)
            throw new IllegalArgumentException("The loan duration must be greater than zero. The value passed was " + numberOfYears);
        else
            this.numberOfYears = numberOfYears;
    }

    /**
     * Return loanAmount
     */
    public double getLoanAmount()
    {
        return loanAmount;
    }

    /**
     * Set a new loanAmount
     */
    public void setLoanAmount(double loanAmount) throws IllegalArgumentException
    {
        if (loanAmount <= 0)
            throw new IllegalArgumentException("Loan amount must be greater than 0. The value passed was " + loanAmount);
        else
            this.loanAmount = loanAmount;
    }

    /**
     * Find monthly payment
     */
    public double getMonthlyPayment()
    {
        double monthlyInterestRate = annualInterestRate / 1200;
        return (loanAmount * monthlyInterestRate) /
                (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    }

    /**
     * Find total payment
     */
    public double getTotalPayment()
    {
        return getMonthlyPayment() * numberOfYears * 12;
    }

    /**
     * Return loan date
     */
    public java.util.Date getLoanDate()
    {
        return loanDate;
    }
}
