public class Ex9_02
{
    public static void main(String[] args)
    {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);
        System.out.printf("The price change percentage for %s is: %4.3f%%", stock.getSymbol(), stock.getChangePercent());
        System.out.println("\n\t" + stock);
    }
}
