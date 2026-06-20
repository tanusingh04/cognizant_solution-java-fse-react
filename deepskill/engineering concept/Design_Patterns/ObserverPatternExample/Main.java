package ObserverPatternExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Observer Pattern ===");

        // Create Concrete Subject
        StockMarket stockMarket = new StockMarket();

        // Create Concrete Observers
        Observer mobileApp1 = new MobileApp("User1_iPhone");
        Observer mobileApp2 = new MobileApp("User2_Android");
        Observer webDashboard = new WebApp("Admin_Console");

        // Register observers
        System.out.println("\n--- Registering Observers ---");
        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webDashboard);

        // Update stock prices (notifications sent to all)
        stockMarket.setStockPrice("AAPL", 175.50);
        stockMarket.setStockPrice("GOOGL", 152.25);

        // Deregister one observer
        System.out.println("\n--- Deregistering User2_Android ---");
        stockMarket.deregisterObserver(mobileApp2);

        // Update stock price again (only remaining observers notified)
        stockMarket.setStockPrice("AAPL", 177.20);
    }
}
