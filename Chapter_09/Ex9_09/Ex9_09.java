public class Ex9_09
{
    public static void main(String[] args)
    {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("regularPolygon1:\n\tPerimeter: " + regularPolygon1.getPerimeter() + "\n\tArea: " + regularPolygon1.getArea());
        System.out.println("regularPolygon2:\n\tPerimeter: " + regularPolygon2.getPerimeter() + "\n\tArea: " + regularPolygon2.getArea());
        System.out.println("regularPolygon3:\n\tPerimeter: " + regularPolygon3.getPerimeter() + "\n\tArea: " + regularPolygon3.getArea());
    }
}
