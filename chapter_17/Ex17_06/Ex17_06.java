import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex17_06
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<Loan> loans= new ArrayList<>();
        loans.add(new Loan());
        loans.add(new Loan(5.5, 10, 50000));
        loans.add(new Loan(2.1, 30, 180000));
        loans.add(new Loan(21, 2, 5000));
        loans.add(new Loan(1.25, 3, 10000));

       writeDat(loans, "Exercise17_06.dat");
    }

    private static void writeDat(ArrayList<Loan> loans, String filename) throws IOException
    {
        try (ObjectOutputStream output = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(filename))))
        {
            for (Loan loan : loans)
                output.writeObject(loan);
        }
    }
}
