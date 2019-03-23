/*********************************************************************************
 * (Square numbers) Find the first ten square numbers that are greater than       *
 * Long.MAX_VALUE. A square number is a number in the form of n2. For example,    *
 * 4, 9, and 16 are square numbers. Find an efficient approach to run your        *
 * program fast.                                                                  *
 *********************************************************************************/
import java.math.BigInteger;

public class Ex10_17
{
    public static void main(String[] args)
    {
        BigInteger bigInteger = new BigInteger(Long.MAX_VALUE + "").sqrt();
        BigInteger[] bigIntegers = new BigInteger[10];
        int count = 0;

        while (count < 10)
        {
            bigInteger = bigInteger.add(BigInteger.valueOf(1));
            bigIntegers[count] = bigInteger.multiply(bigInteger);
            count++;
        }

        for (BigInteger element : bigIntegers)
            System.out.println(element);

    }
}
