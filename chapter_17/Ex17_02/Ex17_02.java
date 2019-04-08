import java.io.*;
import java.util.Random;

public class Ex17_02
{
    private static Random random = new Random();
    private static final String ANSI_CYAN = "\033[36m";
    private static final String ANSI_RESET = "\033[0m";

    public static void main(String[] args) throws IOException
    {
        writeDat();
        readDat();
    }

    private static void writeDat() throws IOException
    {
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("Ex17_02.dat", true)))
        {
            for (int i = 0; i < 150; i++)
                output.writeInt(random.nextInt(1500));
        }
    }

    private static void readDat() throws IOException
    {
        try (DataInputStream input = new DataInputStream(new FileInputStream("Ex17_02.dat")))
        {
            int sum = 0;
            while (input.available() != 0)
                sum += input.readInt();

            System.out.printf("Sum is: %s%,d%s\n", ANSI_CYAN, sum, ANSI_RESET);
        }
    }
}
