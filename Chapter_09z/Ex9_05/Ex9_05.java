import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex9_05
{
    public static void main(String[] args)
    {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        printDate(gregorianCalendar);

        gregorianCalendar.setTimeInMillis(1234567898765L);
        printDate(gregorianCalendar);
    }

    private static void printDate(GregorianCalendar gregorianCalendar)
    {
        System.out.println(gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println(gregorianCalendar.get(GregorianCalendar.MONTH));
        System.out.println(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
