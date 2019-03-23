public class Ex9_07
{
    public static void main(String[] args)
    {
        Account account = new Account(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.printf("\nBalance: $%3.2f\n", account.getBalance());
        System.out.printf("Monthly interest: $%3.2f\n", account.getMonthlyInterest());
        System.out.printf("Account was created on: %s\n", account.getDateCreated());
    }
}
