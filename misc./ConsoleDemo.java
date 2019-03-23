import java.io.Console;

public class ConsoleDemo
{
    private static final String ANSI_GREEN = "\033[1;32m";
    private static final String ANSI_RESET = "\033[0m";

    public static void main(String[] args)
    {
        Console console = System.console();
        if (console == null)
        {
            System.out.print("No console available");
            System.exit(1);
        }

        String input = console.readLine("Enter your name: ");
        System.out.printf("Your name is: %s%s%s\n", ANSI_GREEN, input, ANSI_RESET);

        char[] password = console.readPassword("\nEnter your password: ");
        System.out.printf("Your password is: %s%s%s\n", ANSI_GREEN, String.valueOf(password), ANSI_RESET);
    }
}
