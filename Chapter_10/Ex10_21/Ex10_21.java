/*********************************************************************************
 * (Divisible by 5 or 6) Find the first ten numbers greater than Long.MAX_VALUE   *
 * that are divisible by 5 or 6.                                                  *
 *********************************************************************************/
import java.math.BigInteger;

public class Ex10_21
{
    public static void main(String[] args)
    {
        BigInteger n = BigInteger.valueOf(Long.MAX_VALUE);
        n = n.add(BigInteger.ONE);
        BigInteger[] bigIntegers = new BigInteger[10];
        int count = 0;

        // variables zero, one, five, and six added for readability
        BigInteger zero = BigInteger.ZERO;
        BigInteger one = BigInteger.ONE;
        BigInteger five = BigInteger.valueOf(5);
        BigInteger six = BigInteger.valueOf(6);

        while (count < 10)
        {
            if (n.remainder(five).equals(zero) || n.remainder(six).equals(zero))
            {
                bigIntegers[count] = n;
                count++;
            }
            n = n.add(one);
        }
        for (BigInteger bigInt : bigIntegers)
            System.out.println(bigInt);
    }
}
