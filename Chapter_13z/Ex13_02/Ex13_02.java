import java.util.ArrayList;
import java.util.Random;

public class Ex13_02
{
    private static Random random = new Random();

    public static void main(String[] args)
    {
        average(generateList(1000));
    }

    private static void average(ArrayList<Integer> list)
    {
        int total = 0;
        for (Integer integer : list)
            total += integer;

        System.out.printf("The average value of ArrayList: %,3.3f" +
                "\t(n = %,d \ttotal = %,d)%n",
                total / (double)list.size(),
                list.size(),
                total);
    }

    private static ArrayList<Integer> generateList(int n)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
            list.add(random.nextInt(10001));

        return list;
    }
}
