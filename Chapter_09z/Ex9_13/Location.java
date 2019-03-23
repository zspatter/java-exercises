public class Location
{
    private int row;
    private int column;
    private double maxValue;

    public Location(int row, int column, double maxValue)
    {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    @Override
    public String toString()
    {
        return  "The value of the largest element is " + maxValue + " which is located at (" + row + ", " + column + ")";
    }
}
