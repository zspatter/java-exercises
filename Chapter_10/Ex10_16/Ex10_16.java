/*********************************************************************************
 * (Divisible by 2 or 3) Find the first ten numbers with 50 decimal digits that   *
 * are divisible by 2 or 3.                                                       *
 *********************************************************************************/
import java.math.BigInteger;

public class Ex10_16
{
    public static void main(String[] args)
    {
        BigInteger bigInteger = new BigInteger("10000000000000000000000000000000000000000000000000");
        BigInteger[] bigIntegers = new BigInteger[10];
        int count = 0;

        while (count < 10)
        {
            if (BigInteger.valueOf(0).equals(bigInteger.remainder(BigInteger.valueOf(2))) ||
                    BigInteger.valueOf(0).equals(bigInteger.remainder(BigInteger.valueOf(3))))
            {
                bigIntegers[count] = bigInteger;
                count++;
            }
            bigInteger = bigInteger.add(new BigInteger("1"));
        }

        for (BigInteger element : bigIntegers)
            System.out.println(element);
    }

}
