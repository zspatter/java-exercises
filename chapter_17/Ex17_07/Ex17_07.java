import java.io.*;

public class Ex17_07
{
    private static final String ANSI_CYAN = "\033[36m";
    private static final String ANSI_RESET = "\033[0m";

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        readDat("Exercise17_06.dat");
    }

    private static void readDat(String filename) throws IOException, ClassNotFoundException
    {
        double totalLoanAmount = 0;

        try (ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream(filename))))
        {
            while (true)
            {
                Loan loan = (Loan) input.readObject();
                totalLoanAmount += loan.getLoanAmount();
            }
        } catch (EOFException e)
        {
            System.out.printf("The total loan amount is: %s$%,3.2f%s\n", ANSI_CYAN, totalLoanAmount, ANSI_RESET);
        }
    }
}
