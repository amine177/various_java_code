public class Stock {
   private String symbol;
   private String name;
   private double previousClosingPrice;
   private double currentPrice;
   
   Stock() {
      this("Stock", "STK");
   }

   Stock(String name, String symbol) {
      this.symbol = symbol;
      this.name = name;
   }
}
