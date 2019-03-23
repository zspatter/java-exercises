public class MyPoint
{
    private double x;
    private double y;

    public MyPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public MyPoint()
    {
        this(0, 0);
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double distance(MyPoint myPoint)
    {
        // distance formula
        return Math.sqrt(Math.pow((myPoint.getX() - this.x), 2) +
                Math.pow((myPoint.getY() - this.y), 2));
    }

    public double distance(double x, double y)
    {
        // distance formula
        return Math.sqrt(Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2));
    }

    public static double distance(MyPoint myPoint1, MyPoint myPoint2)
    {
        // distance formula
        return Math.sqrt(Math.pow((myPoint1.getX() - myPoint2.getX()), 2) +
                Math.pow((myPoint1.getY() - myPoint2.getY()), 2));
    }
}
