/*********************************************************************************
 * (Mersenne prime) A prime number is called a Mersenne prime if it can be        *
 * written in the form 2p - 1 for some positive integer p. Write a program that   *
 * finds all Mersenne primes with p … 100 and displays the output as shown below. *
 * (Hint: You have to use BigInteger to store the number, because it is too big   *
 * to be stored in long. Your program may take several hours to run.)             *
 *********************************************************************************/
import java.math.BigInteger;
import java.util.ArrayList;

public class Ex10_19
{
    public static void main(String[] args)
    {
        ArrayList<BigInteger> bigIntegers = new ArrayList<>();
        BigInteger mersenne;

        System.out.printf("%-10s%-25s\n", "p", "2^p - 1");
        System.out.println("---------------------------");
        for (int i = 2; i < 101; i++)
        {
            mersenne = getMersenne(i);
            if (isPrime(mersenne))
            {
                bigIntegers.add(mersenne);
                System.out.printf("%-10d%-25d\n", i, mersenne);
            }
        }

//        for (BigInteger element : bigIntegers)
//            System.out.printf("%-10d%-25d");

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

    private static BigInteger getMersenne(int n)
    {
        BigInteger two = BigInteger.TWO;
        return two.pow(n).subtract(BigInteger.ONE);
    }
}
