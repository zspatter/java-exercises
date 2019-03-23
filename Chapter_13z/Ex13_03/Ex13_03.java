import java.util.ArrayList;
import java.util.Random;

public class Ex13_03
{
    private static Random random = new Random();

    public static void main(String[] args)
    {
        ArrayList<Number> list = generateList(100);
        System.out.println(list.toString());
        sort(list);
        System.out.println(list.toString());
    }
    private static void sort(ArrayList<Number> list)
    {
        Number value1, value2;
        boolean sorted;

        do
        {
            sorted = true;

            for (int i = 0; i < list.size() - 1; i++)
            {
                value1 = list.get(i);
                value2 = list.get(i + 1);

                if (value1.doubleValue() > value2.doubleValue())
                {
                    list.set(i, value2);
                    list.set(i + 1, value1);
                    sorted = false;
                }
            }
        } while (!sorted);
    }

    private static ArrayList<Number> generateList(int n)
    {
        ArrayList<Number> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            list.add(random.nextInt(1001));
        }
        return list;
    }
}
