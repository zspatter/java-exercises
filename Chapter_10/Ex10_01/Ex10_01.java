public class Ex10_01
{
    public static void main(String[] args)
    {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5, 23, 55);

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }
}
