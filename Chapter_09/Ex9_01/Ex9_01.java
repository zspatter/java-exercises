public class Ex9_01
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("The width of rectangle 1 is: " + r1.getWidth());
        System.out.println("The height of rectangle 1 is: " + r1.getHeight());
        System.out.println("The area of rectangle 1 is: " + r1.getArea());
        System.out.println("The perimeter of rectangle 1 is: " + r1.getPerimeter());
        System.out.println("\t" + r1);

        System.out.println("\nThe width of rectangle 2 is: " + r2.getWidth());
        System.out.println("The height of rectangle 2 is: " + r2.getHeight());
        System.out.println("The area of rectangle 2 is: " + r2.getArea());
        System.out.println("The perimeter of rectangle 2 is: " + r2.getPerimeter());
        System.out.println("\t" + r2);
    }
}
