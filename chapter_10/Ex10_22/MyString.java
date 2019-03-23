public class MyString
{
    private char[] chars;

    public MyString(char[] chars)
    {
        this.chars = chars;
    }

    public char chatAt(int index)
    {
        return chars[index];
    }

    public int length()
    {
        return chars.length;
    }

    public MyString substring(int begin, int end)
    {
        char[] chars = new char[end - begin];
        int index = 0;
        for (int i = begin; i < end; i++)
        {
            chars[index] = this.chars[i];
            index++;
        }
        return new MyString(chars);
    }

    public MyString toLowerCase()
    {
        char[] lowerChars = new char[this.chars.length];
        for (int i = 0; i < this.chars.length; i++)
        {
            char c = this.chars[i];
            if (c >= 'A' && c <= 'Z')
                lowerChars[i] = (char)(c + 32);
            else
                lowerChars[i] = c;
        }
        return new MyString(lowerChars);
    }

    public boolean equals(MyString myString)
    {
        if (myString.length() != length())
            return false;
        for (int i = 0; i < length(); i++)
        {
            if (myString.chatAt(i) != chatAt(i))
                return false;
        }
        return true;
    }

    public static MyString valueOf(int i)
    {
        int digitCount = 0;
        int n = i;

        while (n != 0)
        {
            n/= 10;
            digitCount++;
        }

        char[] intToChars = new char[digitCount];
        for (int index = intToChars.length - 1; index >= 0; index--)
        {
            intToChars[index] = (char)((i % 10) + 48);
            i /= 10;
        }
        return new MyString(intToChars);


    }

    public char[] getChars()
    {
        return chars;
    }

    public void setChars(char[] chars)
    {
        this.chars = chars;
    }
}
