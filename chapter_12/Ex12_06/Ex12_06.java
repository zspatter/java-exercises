import java.util.Scanner;

public class Ex12_06
{
    private static Scanner scanner = new Scanner(System.in);
    private static final String ANSI_ORANGE = "\033[38;5;196m";
    private static final String ANSI_RESET = "\033[0m";

    public static void main(String[] args)
    {
        System.out.println("Enter a hex number:");
        String hex = scanner.nextLine();
        hex = hex.toUpperCase();
        try
        {
            System.out.printf("The decimal value for hex number %s%s%s is: %s%d%s\n", 
                ANSI_ORANGE, 
                hex, 
                ANSI_RESET, 
                ANSI_ORANGE, 
                hexToDecimal(hex), 
                ANSI_RESET);
        } catch (NumberFormatException e)
        {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }

    private static int hexToDecimal(String hex)
    {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++)
        {
            if (!(hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F')
                    && !(hex.charAt(i) >= '0' && hex.charAt(i) <= '9'))
            {
                throw new NumberFormatException("This is an invalid hex string.");
            }

            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }

        return decimalValue;
    }

    private static int hexCharToDecimal(char ch)
    {
       return (ch >= 'A' && ch <= 'F') ? 10 + ch - 'A' : ch - '0';
    }
}
