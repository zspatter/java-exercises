public class Rectangle
{
    private double width;
    private double height;

    public Rectangle()
    {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString()
    {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }

    public double getArea()
    {
        return width * height;
    }

    public double getPerimeter()
    {
        return (width * 2) + (height * 2);
    }
}
