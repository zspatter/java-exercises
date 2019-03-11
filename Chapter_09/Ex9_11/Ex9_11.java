import java.util.Scanner;

public class Ex9_11
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        double a, b, c, d, e, f;
        System.out.println("Enter the values for a, b, c, d, e, and f:");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        e = scanner.nextDouble();
        f = scanner.nextDouble();
        scanner.nextLine();

        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
        if (linearEquation.isSolvable())
        {
            System.out.println("x = " + linearEquation.getX());
            System.out.println("y = " + linearEquation.getY());
        } else
            System.out.println("The equation has no solution.");
    }
}
