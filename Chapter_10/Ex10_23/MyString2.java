public class MyString2
{
    private char[] chars;

    public MyString2(String s)
    {
        this.chars = s.toCharArray();
    }

    public MyString2(char[] chars)
    {
        this.chars = chars;
    }

    public int compare(String s)
    {
        // a is shorter string, b is larger
        MyString2 a;
        MyString2 b;

        if (length() <= s.length())
        {
            a = new MyString2(chars);
            b = new MyString2(s);
        } else
        {
            a = new MyString2(s);
            b = new MyString2(chars);
        }

        // compare loop tied to shorter loop to avoid OutOfBounds
        for (int i = 0; i < a.length(); i++)
        {
            if (a.charAt(i) != b.charAt(i))
                return (int)(a.charAt(i) - b.charAt(i));
        }

        // (no differences found up to length of smaller string)
        // if length is not equal, return the difference in length
        if (length() != s.length())
            return length() - s.length();

        // if reached here, strings are equal
        return 0;
    }

    public MyString2 substring(int begin)
    {
        char[] substring = new char[length() - begin];

        for (int i = begin, index = 0; i < length(); i++, index++)
            substring[index] = charAt(i);

        return new MyString2(substring);
    }

    public MyString2 toUpperCase()
    {
        char[] upper = new char[length()];
        for (int i = 0; i < length(); i++)
        {
            char c = charAt(i);
            if (c >= 'a' && c <= 'z')
                upper[i] = (char)(c - 32);
            else
                upper[i] = c;
        }
        return new MyString2(upper);
    }

    public char[] toChars()
    {
        return this.chars;
    }

    public static MyString2 valueOf(boolean b)
    {
        return new MyString2(b ? "true" : "false");
    }

    public int length()
    {
        return chars.length;
    }

    public char charAt(int index)
    {
        return chars[index];
    }
}
