import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex12_11
{
    private static StringBuilder sb = new StringBuilder();
    private static String replacedText;

    public static void main(String[] args)
    {
        validateCommandArguments(args);
        File file = new File(args[1]);
        verifyFileExists(file);

        readFile(args[0], file);
        writeFile(file);
    }

    private static void readFile(String removeText, File file)
    {
        try (Scanner scanner = new Scanner(file))
        {
            while (scanner.hasNext())
            {
                sb.append(scanner.nextLine());
                sb.append("\n");
            }
            removeTextFromString(removeText);
        } catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }

    private static void removeTextFromString(String removeText)
    {
        replacedText = sb.toString().replaceAll(removeText, "");
    }

    private static void writeFile(File file)
    {
        try (PrintWriter printWriter = new PrintWriter(file))
        {
            printWriter.println(replacedText);
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }

    private static void validateCommandArguments(String[] args)
    {
        if (args.length != 2)
        {
            System.out.println("Usage: java Ex12_11 [stringToRemoveFromFile] [fileName]");
            System.exit(1);
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
