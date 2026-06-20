package ObserverPatternExample;

public class WebApp implements Observer {
    private String serverName;

    public WebApp(String serverName) {
        this.serverName = serverName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[Web Dashboard - " + serverName + "] Live Price Feed: " +
                stockName + " -> $" + price);
    }
}
