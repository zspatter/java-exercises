public class MyInteger
{
    private int value;

    public MyInteger(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public boolean isEven()
    {
        return value % 2 == 0;
    }

    public boolean isOdd()
    {
        return value % 2 == 1;
    }

    public boolean isPrime()
    {
        for (int i = 2; i < value; i++)
            if (value % i == 0)
                return false;

        return true;
    }

    public static boolean isEven(int n)
    {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n)
    {
        return n % 2 == 1;
    }

    public static boolean isPrime(int n)
    {
        for (int i = 2; i < (int)(Math.sqrt(n)) + 1; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public boolean equals(int n)
    {
        return value == n;
    }

    public boolean equals(MyInteger myInteger)
    {
        return value == myInteger.getValue();
    }

    public static int parseInt(char[] chars)
    {
        StringBuilder sb = new StringBuilder();
        for (char element : chars)
            sb.append(element);
        return Integer.parseInt(sb.toString());
    }

    public static int parseInt(String string)
    {
        return Integer.parseInt(string);
    }
}
