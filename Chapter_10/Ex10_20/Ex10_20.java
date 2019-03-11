/*********************************************************************************
 * (Approximate e) Programming Exercise 5.26 approximates e using the following   *
 * series:                                                                        *
 *                                                                                *
 *       e = 1 + (1 / 1!) + (1 / 2!) + (1 / 3!) + (1 / 4!) + ... + (1 / i!)       *
 *                                                                                *
 * In order to get better precision, use BigDecimal with 25 digits of precision   *
 * in the computation. Write a program that displays the e value for              *
 * i = 100, 200, . . . , and 1000.                                                *
 *********************************************************************************/
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex10_20
{
    public static void main(String[] args)
    {
        BigDecimal e = BigDecimal.ONE;

        for (int i = 1; i < 1001; i++)
        {
            e = e.add(BigDecimal.ONE.divide(factorial(BigDecimal.valueOf(i)), 25, RoundingMode.HALF_UP));
            if (i % 100 == 0)
                System.out.printf("i = %4d: %-26.25f\n", i, e);
        }
    }

    private static BigDecimal factorial(BigDecimal n)
    {
        if (n.equals(BigDecimal.ONE))
            return BigDecimal.ONE;
        return n.multiply(factorial(n.subtract(BigDecimal.ONE)));
    }
}
