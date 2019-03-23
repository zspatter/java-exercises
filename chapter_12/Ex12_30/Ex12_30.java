import java.io.*;
import java.util.Scanner;

public class Ex12_30
{
    private static Scanner scanner = new Scanner(System.in);
    private static int[] alphaCounts = new int[26];

    public static void main(String[] args)
    {
        File file = getFile();
        verifyFileExists(file);
        System.out.println();

        readLines(file);
        printResults();
    }

    private static File getFile()
    {
        System.out.print("Enter a filename: ");
        return new File(scanner.next());
    }

    private static void readLines(File file)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null)
                countLetters(line.toUpperCase());

        } catch (FileNotFoundException e)
        {
            System.out.println("No file " + file.getName() + " was found.");
            System.exit(1);
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
            System.exit(1);
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
            System.out.printf("Total number of %s's:%3s%d\n", (char) ('A' + i), "", alphaCounts[i]);
    }

    private static void verifyFileExists(File file)
    {
        if (!file.exists())
        {
            System.out.println("No file " + file.getName() + " was found.");
            System.exit(1);
        }
    }
}