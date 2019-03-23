import java.util.Scanner;

public class Ex12_06
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter a hex number:");
        String hex = scanner.nextLine();
        hex = hex.toUpperCase();
        try
        {
            System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex));
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

            char hexChar = (hex.charAt(i));
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    private static int hexCharToDecimal(char ch)
    {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
