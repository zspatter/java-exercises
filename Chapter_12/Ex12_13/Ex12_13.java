import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex12_13
{
    private static int charCount, wordCount, lineCount;

    public static void main(String[] args)
    {
        validateCommandArguments(args);
        File file = new File(args[1]);
        verifyFileExists(args, file);

        countCharsAndWords(file);
        countLines(file);
        printCounts();
    }

    private static void countCharsAndWords(File file)
    {
        try (Scanner scanner = new Scanner(file))
        {
            while (scanner.hasNext())
            {
                String s = scanner.next();
                charCount += s.length();
                wordCount++;
            }
        } catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }

    private static void countLines(File file)
    {
        try (Scanner scanner = new Scanner(file))
        {
            while (scanner.hasNext())
            {
                scanner.nextLine();
                lineCount++;
            }
        } catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }

    private static void printCounts()
    {
        System.out.printf("%12s %d\n", "Characters:", charCount);
        System.out.printf("%12s %d\n", "Words:", wordCount);
        System.out.printf("%12s %d\n", "Lines:", lineCount);
    }

    private static void validateCommandArguments(String[] args)
    {
        if (args.length != 1)
        {
            System.out.println("Usage: java Ex12_13 [fileName]");
            System.exit(1);
        }
    }

    private static void verifyFileExists(String[] args, File file)
    {
        if (!file.exists())
        {
            System.out.println("No file " + args[1] + " was found.");
            System.exit(2);
        }
    }
}
