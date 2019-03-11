import java.util.Scanner;

public class Ex10_26
{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter an equation:");
        String input = scanner.nextLine();
        String[] separated = input.split("\\s+");

        if (!isValidInput(separated))
        {
            System.out.println("The input could not be parsed properly.");
            System.exit(-1);
        }

        double result = 0;
        double operand1 = Double.parseDouble(separated[0]);
        double operand2 = Double.parseDouble(separated[2]);
        char operator = separated[1].charAt(0);

        switch (operator)
        {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
        }

        System.out.printf("%1.0f %1s %1.0f = %1.0f", operand1, operator, operand2, result);
    }

    public static boolean isValidInput(String[] input)
    {
        if (input.length != 3)
            return false;

        if (input[1].length() != 1)
            return false;

        try
        {
            Double.parseDouble(input[0]);
            Double.parseDouble(input[2]);
        } catch (Exception e)
        {
            return false;
        }

        char c = input[1].charAt(0);
        if (c != '+' && c != '-' && c != '*' && c != '/')
            return false;

        return true;
    }
}
