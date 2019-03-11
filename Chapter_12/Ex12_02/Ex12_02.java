import java.util.Scanner;

public class Ex12_02
{
    private static Scanner scanner = new Scanner(System.in);
    private static String[] months = {"January", "February", "March", "April",
            "May", "June","July", "August", "September", "October",
            "November", "December"};
    private static int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args)
    {
        int input = getUserInput();

        try
        {
            String month = months[input - 1];
            int days = dom[input - 1];
            System.out.println("The month corresponding with your input is "
                    + month + " which has " + days + " days in it.");
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
