public class QuadraticEquation
{
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant()
    {
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        if (discriminant >= 0)
            return discriminant;
        else
            return -1;
    }

    public double getRoot1()
    {
        return ((b * -1) + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2()
    {
        return ((b * -1) - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    public double getC()
    {
        return c;
    }
}
