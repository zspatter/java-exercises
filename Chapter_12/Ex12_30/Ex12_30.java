import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex12_30
{
    private static Scanner scanner = new Scanner(System.in);
    private static int[] alphaCounts = new int[26];

    public static void main(String[] args)
    {
        System.out.println(Arrays.toString(alphaCounts));
        File file = getFile();
        verifyFileExists(file);

        readLines(file);
        System.out.println(Arrays.toString(alphaCounts));
        printResults();
    }

    private static File getFile()
    {
        System.out.println("Enter a filename:");
        return new File(scanner.next());
    }

    private static void readLines(File file)
    {
        try (Scanner read = new Scanner(file))
        {
            String s = "a";
               while (read.hasNext())
               {
                   s = read.next().toUpperCase();
                   countLetters(s);
               }
        } catch (FileNotFoundException e)
        {
            System.out.println("No file " + file.getName() + " was found.");
            System.exit(2);
        }
    }

    private static void countLetters(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isLetter(ch))
                alphaCounts[ch - 'A']++;
        }
    }

    private static void printResults()
    {
        for (int i = 0; i < alphaCounts.length; i++)
        {
            System.out.printf("Number of %s's: %d\n", (char)('A' + i), alphaCounts[i]);
        }
    }

    private static void verifyFileExists(File file)
    {
        if (!file.exists())
        {
            System.out.println("No file " + file.getName() + " was found.");
            System.exit(2);
        }
    }
}
