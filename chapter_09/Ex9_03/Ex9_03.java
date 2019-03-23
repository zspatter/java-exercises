public class Ex9_03
{
    public static void main(String[] args)
    {
        java.util.Date date = new java.util.Date(10000);
        System.out.println(date);
        date.setTime(100000);
        System.out.println(date);
        date.setTime(1000000);
        System.out.println(date);
        date.setTime(10000000);
        System.out.println(date);
        date.setTime(100000000);
        System.out.println(date);
        date.setTime(1000000000);
        System.out.println(date);
        date.setTime(10000000000L);
        System.out.println(date);
        date.setTime(100000000000L);
        System.out.println(date);
    }
}
