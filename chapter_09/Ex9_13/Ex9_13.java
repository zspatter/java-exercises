import java.util.Scanner;

public class Ex9_13
{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter the number of rows in your array: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns in your array: ");
        int columns = scanner.nextInt();
        double[][] arr = new double[rows][columns];
        assignValues(arr);
        Location location = locateLargest(arr);
        System.out.println(location);
    }

    private static void assignValues(double[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("Enter the values for row " + (i + 1) + ":");
            for (int j = 0; j <arr[i].length; j++)
            {
                arr[i][j] = Double.parseDouble(scanner.next());
            }
        }
    }

    private static Location locateLargest(double[][] arr)
    {
        int row = 0;
        int column = 0;
        double maxValue = arr[0][0];

        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
            {
                if (maxValue < arr[i][j])
                {
                    maxValue = arr[i][j];
                    row = i;
                    column = j;
                }
            }
        return new Location(row, column, maxValue);
    }
}
