import java.util.Scanner;

public class Ex9_10
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter a value for a:");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a value for b:");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter a value for c:");
        int c = scanner.nextInt();
        scanner.nextLine();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() > 0)
        {
            System.out.println("Root1: " + quadraticEquation.getRoot1());
            System.out.println("Root2: " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0)
            System.out.println("Root: " + quadraticEquation.getRoot1());
        else
            System.out.println("The equation has no roots.");
    }
}
