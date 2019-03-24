import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex13_04
{
    public static void main(String[] args)
    {
        if (!validateArguments(args))
        {
            System.out.println("Usage: java Ex13_04 [month (1-12)] [year (4 digits)]");
            System.exit(1);
        }

        Calendar calendar = buildCalendarObject(args);
        printMonth(calendar);
        exportFullYear(calendar);
    }

    private static boolean validateArguments(String[] args)
    {
        if (args.length == 2)
        {
            return validateMonth(args[0]) && validateYear(args[1]);
        } else if (args.length == 0)
            return true;
        else
            return args.length == 1 && validateMonth(args[0]);
    }

    private static boolean validateMonth(String month)
    {
        return month.matches("0*[1-9]") || month.matches("1[012]");
    }

    private static boolean validateYear(String year)
    {
        return year.matches("\\d{4}");
    }

    private static Calendar buildCalendarObject(String[] args)
    {
        if (args.length == 2)
            return new GregorianCalendar(Integer.parseInt(args[1]),
                    Integer.parseInt(args[0]) - 1,
                    1);

        Calendar calendar = Calendar.getInstance();
        if (args.length == 1)
            return new GregorianCalendar(calendar.get(Calendar.YEAR),
                    Integer.parseInt(args[0]) - 1,
                    1);
        else
            return new GregorianCalendar(calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH), 1);
    }

    private static void printMonth(Calendar calendar)
    {
        System.out.println(buildMonthHeader(calendar, true) + buildMonthBody(calendar));
    }

    private static String buildMonthHeader(Calendar calendar, boolean isColored)
    {
    	String asni_grey = "";
    	String ansi_reset = "";
    	if (isColored)
    	{
    		asni_grey = "\033[38;5;243m";
    		ansi_reset = "\033[0m";
    	}
        int length = (29 / 2) - ((getMonthName(calendar.get(Calendar.MONTH)).length() + 5) / 2);
        String centerHeader = "%" + length + "s%s%s %d%n", str = "";

        str += String.format(centerHeader, "",
        		asni_grey,
                getMonthName(calendar.get(Calendar.MONTH)),
                calendar.get(Calendar.YEAR));
        str += String.format("%s%n", "-----------------------------");
        str += String.format("%4s%4s%4s%4s%4s%4s%4s%s%n",
                "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", ansi_reset);
        return str;
    }

    private static String buildMonthBody(Calendar calendar)
    {
        String padding = "";
        StringBuilder sb = new StringBuilder();

        // Pad space before the first day of the month
        for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++)
            sb.append(String.format("%4s", padding));

        // loop terminates when month changes (jan 31 -> feb 1)
        for (int i = 1; i == calendar.get(Calendar.DATE); i++, calendar.add(Calendar.DATE, 1))
        {
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY
                    && calendar.get(Calendar.DATE) != calendar.getActualMaximum(Calendar.DATE))
                sb.append(String.format("%4d%n", calendar.get(Calendar.DATE)));
            else
                sb.append(String.format("%4d", calendar.get(Calendar.DATE)));
        }
        return sb.toString();
    }

    private static String getMonthName(int month)
    {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return months[month];
    }

    /**
     * Writes the full annual calendar for the given year to a .txt file
     *
     * @param calendar
     */
    private static void exportFullYear(Calendar calendar)
    {
        StringBuilder sb = new StringBuilder();
        File file = new File("annual_calendar.txt");
        Calendar calendarCopy = (Calendar) calendar.clone();
        calendarCopy.set(Calendar.MONTH, 0);

        for (int i = 0; i < 12; i++)
            sb.append(String.format("%s%s%n%n",
                    buildMonthHeader(calendarCopy, false),
                    buildMonthBody(calendarCopy)));

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file)))
        {
            bufferedWriter.write(sb.toString());
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }
}
