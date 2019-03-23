import java.util.Scanner;

public class Ex9_12
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        double x1, y1, x2, y2, x3, y3, x4, y4, a, b, c, d, e, f;
        System.out.println("You will need to enter the coordinates for 4 points. x1, y1, x2, " +
                "and y2 correspond with the first line. x3, y3, x4, and y4 correspond with the second line.");
        System.out.print("Enter x1: ");
        x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        y2 = scanner.nextDouble();
        System.out.print("Enter x3: ");
        x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        y3 = scanner.nextDouble();
        System.out.print("Enter x4: ");
        x4 = scanner.nextDouble();
        System.out.print("Enter y4: ");
        y4 = scanner.nextDouble();
        scanner.nextLine();

        a = y1 - y2;
        b = (x1 - x2) * -1;
        c = y3 - y4;
        d = (x3 - x4) * -1;
        e = ((y1 - y2) * x1) - ((x1 - x2) * y1);
        f = ((y3 - y4) * x3) - ((x3 - x4) * y3);

        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
        if (linearEquation.isSolvable())
            System.out.printf("These lines intersect at: (%4.3f, %4.3f)", linearEquation.getX(), linearEquation.getY());
        else
            System.out.println("The two lines are parallel.");
    }
}