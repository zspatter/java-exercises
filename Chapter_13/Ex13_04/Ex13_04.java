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
//        printFullYear(calendar);
    }

    private static boolean validateArguments(String[] args)
    {
        if (args.length == 2)
            return validateMonth(args[0]) && validateYear(args[1]);
        else if (args.length == 0)
            return true;
        else
            return args.length == 1 && validateMonth(args[0]);
    }

    private static boolean validateMonth(String month)
    {
        return month.matches("0*[1-9]") || month.matches("1[012]");

//            System.out.println("The passed argument of " + month +
//                    " for month is invalid. Valid months range from 1-12");
//            System.exit(1);
    }

    private static boolean validateYear(String year)
    {
        return year.matches("\\d{4}");

//            System.out.println("The passed argument of " + year +
//                    " for year is invalid. Valid years must be 4 digits.");
//            System.exit(1);
    }

    private static Calendar buildCalendarObject(String[] args)
    {
        if (args.length == 2)
            return new GregorianCalendar(Integer.parseInt(args[1]), Integer.parseInt(args[0]) - 1, 1);

        Calendar calendar = Calendar.getInstance();
        if (args.length == 1)
            return new GregorianCalendar(calendar.get(Calendar.YEAR), Integer.parseInt(args[0]) - 1, 1);
        else
            return new GregorianCalendar(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), 1);
    }

    private static void printMonth(Calendar calendar)
    {
        printMonthHeader(calendar);
        printMonthBody(calendar);
    }

    private static void printMonthHeader(Calendar calendar)
    {
        int length = (29 / 2) - ((getMonthName(calendar.get(Calendar.MONTH)).length() + 5) / 2);
        String centerHeader = "%" + length + "s%s %d%n";

        System.out.printf(centerHeader, "", getMonthName(calendar.get(Calendar.MONTH)), calendar.get(Calendar.YEAR));
        System.out.println("-----------------------------");
        System.out.printf("%4s%4s%4s%4s%4s%4s%4s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
    }

    private static void printMonthBody(Calendar calendar)
    {
        String padding = "";

        // Pad space before the first day of the month
        for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++)
            System.out.printf("%4s", padding);

        for (int i = calendar.get(Calendar.DATE); i <= calendar.getActualMaximum(Calendar.DATE); i++, calendar.add(Calendar.DATE, 1))
        {
            if (calendar.get(Calendar.DAY_OF_WEEK) == 7)
                System.out.printf("%4d\n", i);
            else
                System.out.printf("%4d", i);
        }
        System.out.println();
    }

    private static String getMonthName(int month)
    {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        return months[month];
    }

    private static void printFullYear(Calendar calendar)
    {
        Calendar tempCal = new GregorianCalendar(calendar.get(Calendar.YEAR), 0, 1);

        for (int i = 0; i < 12; i++)
        {
            printMonth(tempCal);
            System.out.println();
        }
    }
}
