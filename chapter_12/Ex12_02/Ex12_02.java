import java.util.Scanner;

public class Ex12_02
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
            //System.out.println("The month corresponding with your input is "
                    //+ month + " which has " + days + " days in it.");
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid input.");
        }
    }

    private static int getUserInput()
    {
        System.out.println("Enter an integer between 1 and 12:");
        return scanner.nextInt();
    }
}
