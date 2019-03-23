public class Circle2D
{
    private double x;
    private double y;
    private double radius;

    public Circle2D()
    {
        this(0, 0, 1);
    }

    public Circle2D(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getRadius()
    {
        return radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public boolean contains(double x, double y)
    {
        // true iff coords are in range of circle
        return (Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2)) <= Math.pow(radius, 2);
    }

    public boolean contains(Circle2D circle2D)
    {
        // true iff circle2D is in this.circle
        return this.radius > ((Math.sqrt(Math.pow((circle2D.getX() - this.x), 2) +
                Math.pow((circle2D.getY() - this.y), 2))) + circle2D.getRadius());
    }

    public boolean overlaps(Circle2D circle2D)
    {
       double difference = Math.pow((circle2D.getRadius() - this.radius), 2);
       double sum = Math.pow((circle2D.getRadius() + this.radius), 2);
       double distance = Math.pow((circle2D.getX() - this.x), 2) + Math.pow((circle2D.getY() - this.y), 2);

       return difference <= distance && distance <=sum;
    }
}
