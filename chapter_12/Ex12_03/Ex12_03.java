import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex12_03
{
    private static Scanner scanner = new Scanner(System.in);
    private static String[] months = {"January", "February", "March", "April",
            "May", "June","July", "August", "September", "October",
            "November", "December"};
    private static int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static final String ANSI_ORANGE = "\033[38;5;202m";
	private static final String ANSI_RESET = "\033[0m";

    public static void main(String[] args)
    {
        int input = getUserInput();

        try
        {
            String month = months[input - 1];
            int days = dom[input - 1];
            System.out.printf("The month corresponding with your input is %s%s%s which has %s%d%s days in it.", ANSI_ORANGE, month, ANSI_RESET, ANSI_ORANGE, days, ANSI_RESET);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid input.");
        }
    }

    private static int getUserInput()
    {
        int input = 0;
        try
        {
            System.out.println("Enter an integer between 1 and 12:");
            input = scanner.nextInt();
        } catch (InputMismatchException e)
        {
            System.out.println("Invalid input type. Expected an integer argument.");
            System.exit(1);
        }
        return input;
    }
}
