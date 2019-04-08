import java.io.*;
import java.util.Random;

public class Ex17_03
{
    private static Random random = new Random();
    private static final String ANSI_CYAN = "\033[36m";
    private static final String ANSI_RESET = "\033[0m";

    public static void main(String[] args) throws IOException
    {
        writeToDat();
        readFromDat();
    }

    private static void writeToDat() throws IOException
    {
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("Ex17_03.dat", true)))
        {
            int n = random.nextInt(500);
            for (int i = 0; i < n; i++)
                output.writeDouble(random.nextDouble());
        }
    }

    private static void readFromDat() throws IOException
    {
        try (DataInputStream input = new DataInputStream(new FileInputStream("Ex17_03.dat")))
        {
            double sum = 0;

            while (input.available() != 0)
                sum += input.readDouble();

            System.out.printf("The sum of all floating points is: %s%,f%s\n", ANSI_CYAN, sum, ANSI_RESET);
        }
    }
}
