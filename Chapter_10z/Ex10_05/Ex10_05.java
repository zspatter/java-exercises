import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex10_05
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int input = getPositiveInteger();
        if (input < 0)
            System.exit(0);

        StackOfIntegers stackOfIntegers = getPrimeFactors(input);
        System.out.println("Prime factors: " + getStringFromStack(stackOfIntegers));
    }

    private static int getPositiveInteger()
    {
        int x;
        System.out.print("Enter a positive integer: ");
        try
        {
            x = scanner.nextInt();
            if (x < 0)
                System.out.println("That value is negative!");
        } catch (InputMismatchException e)
        {
            System.out.println("That value isn't an integer!");
            return -1;
        }
        return x;
    }

    private static StackOfIntegers getPrimeFactors(int n)
    {
        StackOfIntegers stackOfIntegers = new StackOfIntegers();
        for (int i = 2; i <= n; i++)
        {
            if (n % i == 0 && MyInteger.isPrime(i))
                stackOfIntegers.push(i);
        }
        return stackOfIntegers;
    }

    private static String getStringFromStack(StackOfIntegers stackOfIntegers)
    {
        StringBuilder sb = new StringBuilder();
        while (stackOfIntegers.getSize() > 0)
            sb.append(stackOfIntegers.pop() + " ");

        return sb.toString();
    }

    private static String reverseString(String string)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = string.length() - 2; i >= 0; i--)
            sb.append(string.charAt(i));

        return sb.toString();
    }
}
