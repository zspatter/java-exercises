public class Stock
{
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name)
    {
        this.symbol = symbol;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Stock{" +
                "symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", previousClosingPrice=" + previousClosingPrice +
                ", currentPrice=" + currentPrice +
                '}';
    }

    public String getSymbol()
    {
        return symbol;
    }

    public void setSymbol(String symbol)
    {
        this.symbol = symbol;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getPreviousClosingPrice()
    {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice)
    {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice()
    {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice)
    {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent()
    {
        if (previousClosingPrice > currentPrice)
            return getPercentDecrease();
        else
            return getPercentIncrease();
    }

    private double getPercentIncrease()
    {
        double increase = currentPrice - previousClosingPrice;
        return increase / previousClosingPrice * 100;
    }

    private double getPercentDecrease()
    {
        double decrease = previousClosingPrice - currentPrice;
        return decrease / previousClosingPrice * 100;
    }
}
