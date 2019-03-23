public class Triangle2D
{
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    public Triangle2D()
    {
        this(new MyPoint(0, 0), new MyPoint(1, 1), new MyPoint(2, 5));
    }

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1()
    {
        return p1;
    }

    public void setP1(MyPoint p1)
    {
        this.p1 = p1;
    }

    public MyPoint getP2()
    {
        return p2;
    }

    public void setP2(MyPoint p2)
    {
        this.p2 = p2;
    }

    public MyPoint getP3()
    {
        return p3;
    }

    public void setP3(MyPoint p3)
    {
        this.p3 = p3;
    }

    public double getArea()
    {
        // shoelace formula
        double LHS = (p1.getX() - p3.getX()) * (p2.getY() - p1.getY());
        double RHS = (p1.getX() - p2.getX()) * (p3.getY() - p1.getY());
        return 0.5 * (LHS - RHS);
    }

    private double getDistance(MyPoint p1, MyPoint p2)
    {
        double LHS = Math.pow((p2.getX() - p1.getX()), 2);
        double RHS = Math.pow((p2.getY() - p1.getY()), 2);
        return Math.sqrt(LHS + RHS);
    }

    public double getPerimter()
    {
        double side1 = getDistance(p1, p2);
        double side2 = getDistance(p2, p3);
        double side3 = getDistance(p3, p1);
        return side1 + side2 + side3;
    }
}
