public class Ex10_04
{
    public static void main(String[] args)
    {
        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(10, 30.5);
        System.out.println("Distance: " + MyPoint.distance(myPoint1, myPoint2));
    }
}
