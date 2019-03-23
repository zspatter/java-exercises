/*********************************************************************************
 * (Large prime numbers) Write a program that finds five prime numbers larger     *
 * than Long.MAX_VALUE.                                                           *
 *********************************************************************************/
import java.math.BigInteger;

public class Ex10_18
{
    public static void main(String[] args)
    {
        BigInteger bigInteger = new BigInteger(Long.MAX_VALUE + "");
        bigInteger = bigInteger.add(BigInteger.ONE);
        BigInteger[] bigIntegers = new BigInteger[5];
        int count = 0;

        while (count < 5)
        {
            if (isPrime(bigInteger))
            {
                bigIntegers[count] = bigInteger;
                count++;
            }
            bigInteger = bigInteger.add(BigInteger.ONE);
        }

        for (BigInteger element : bigIntegers)
            System.out.println(element);
    }


    private static boolean isPrime(BigInteger n)
    {
        BigInteger zero = new BigInteger("0");
        BigInteger one = new BigInteger("1");
        BigInteger two = new BigInteger("2");

        if (n.equals(two))
            return true;

        if (n.equals(zero) || n.equals(one) || n.remainder(two).equals(zero))
            return false;

        BigInteger i = new BigInteger("3");
        BigInteger sqrt = n.sqrt();

        for (; i.compareTo(sqrt) != 1; i = i.add(two))
            if (n.remainder(i).equals(zero))
                return false;

        return true;
    }
}
