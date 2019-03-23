public class Fan
{
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;  //slow
    private boolean on; // false
    private double  radius; // 5
    private String color;   // blue

    public Fan()
    {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan(int speed, boolean on, double radius, String color)
    {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString()
    {
        if (on)
            return "Fan{" + "speed=" + speed + ", on=" + on + ", radius=" + radius + ", color='" + color + '\'' + '}';
        else
            return "Fan{" + "color='" + color + '\'' + ", radius=" + radius + ", 'fan is off'}";
    }

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public boolean isOn()
    {
        return on;
    }

    public void setOn(boolean on)
    {
        this.on = on;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
}
