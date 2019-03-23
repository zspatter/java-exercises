/**
 * Zachary Patterson
 * Lab 1
 * 2019-01-26
 * INFO 211
 */

import java.util.Scanner;

public class Ex10_07
{
    private Account[] accounts;

    // constructor creates an array with 8 accounts and initializes
    // the accounts with an id of 1-8 and with a balance of $50
    public UserAccounts()
    {
        accounts = new Account[8];
        for (int i = 0; i < accounts.length; i++)
            accounts[i] = new Account(i + 1, 50);
    }

    // returns array of Account
    public Account[] getAccounts()
    {
        return accounts;
    }
}

class UserAccountsTest
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        // tasks from problem 2
        UserAccounts userAccounts = new UserAccounts();
        enterIdLoop(userAccounts);
    }

    // infinite loop that prompts for an account id
    // this verifies the input is of the right type and
    // checks for an id match before proceeding
    private static void enterIdLoop(UserAccounts userAccounts)
    {
        int id, index;

        while (true)
        {
            System.out.print("Enter an id:  ");
            // verify input is of int type
            if (scanner.hasNextInt())
                id = scanner.nextInt();
                // if the input isn't of int type, error message is printed and the loop is restarted
            else
            {
                System.out.println("The id must be entered as an integer. Try another value.");
                continue;
            }

            // gets index of id in Account[]
            index = findIndexOfId(userAccounts, id);

            // if there is no match between input and available id's,
            // error message is printed and the loop is restarted
            if (index == -1)
            {
                System.out.println("\nNo match was found with that id. Try another id.");
                continue;
            }

            mainMenuLoop(userAccounts, index);
        }
    }

    // gathers the index at which the input id is
    // if no match, returns -1
    private static int findIndexOfId(UserAccounts userAccounts, int id)
    {
        for (int i = 0; i < userAccounts.getAccounts().length; i++)
        {
            int tempID = userAccounts.getAccounts()[i].getId();
            if (id == tempID)
                return i;
        }
        return -1;
    }

    // calls printMenu(), then gathers input from console
    // input is checked to verify it is of the correct type
    // if not, an error message is printed and the loop is restarted
    // once the input has been validated, the input is used as the expression for the switch statement
    private static void mainMenuLoop(UserAccounts userAccounts, int index)
    {
        boolean exit = false;
        int input;

        while (!exit)
        {
            // prevents endless loop of input error messages after a string is entered as value for deposit or withdrawal
            printMenu();
            if (scanner.hasNextInt())
                input = scanner.nextInt();
            else
            {
                System.out.println("The choice must be entered as an integer. Try another value.");
                continue;
            }

            // validated input enters switch statement
            // switch statement cases correspond with the main menu options
            // if the input is an int value, but not an available menu option, an error message in printed
            switch (input)
            {
                // prints current balance of the account
                case 1:
                    System.out.printf("The balance is: $%3.2f\n", userAccounts.getAccounts()[index].getBalance());
                    break;
                // prompts for withdraw amount and verifies input is of correct type
                // if not, error message is printed
                // otherwise, calls withdraw method from Account class (processes withdrawal)
                case 2:
                    double withdrawAmount;
                    System.out.print("Enter an amount to withdraw:  ");
                    if (scanner.hasNextDouble())
                        withdrawAmount = scanner.nextDouble();
                    else
                    {
                        System.out.println("The withdraw amount must be entered as a double value. Cannot complete transaction.");
                        // prevents endless loop of input error messages from main menu
                        // after a string (ex. 1.2a) is entered as value for withdrawal
                        scanner.next();
                        break;
                    }
                    userAccounts.getAccounts()[index].withdraw(withdrawAmount);
                    break;
                // prompts for deposit amount and verifies input is of correct type
                // if not, error message is printed
                // otherwise, calls deposit method from Account class (processes deposit)
                case 3:
                    double depositAmount;
                    System.out.print("Enter an amount to deposit:  ");
                    if (scanner.hasNextDouble())
                        depositAmount = scanner.nextDouble();
                    else
                    {
                        System.out.println("The deposit amount must be entered as a double value. Cannot complete transaction.");
                        // prevents endless loop of input error messages from main menu
                        // after a string (ex. 1.2a) is entered as value for deposit
                        scanner.next();
                        continue;
                    }
                    userAccounts.getAccounts()[index].deposit(depositAmount);
                    break;
                // exits main menu (outer loop prompts for another account id)
                case 4:
                    exit = true;
                    break;
                // prints error message for input that is of the correct type, but an invalid option
                default:
                    System.out.println("\"" + input + "\" isn't a valid menu option. Try another menu option.");
            }
        }
    }

    // prints options for main menu
    private static void printMenu()
    {
        System.out.println("\nMain menu");
        System.out.println("1:\tcheck balance");
        System.out.println("2:\twithdraw");
        System.out.println("3:\tdeposit");
        System.out.println("4:\texit");
        System.out.print("Enter a choice:  ");
    }
}
