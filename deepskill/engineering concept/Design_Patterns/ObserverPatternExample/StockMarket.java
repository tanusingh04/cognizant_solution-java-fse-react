package ObserverPatternExample;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers;
    private String stockName;
    private double price;

    public StockMarket() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
        System.out.println("Observer registered: " + o.getClass().getSimpleName());
    }

    @Override
    public void deregisterObserver(Observer o) {
        observers.remove(o);
        System.out.println("Observer deregistered: " + o.getClass().getSimpleName());
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }

    // Set stock price and notify all registered observers
    public void setStockPrice(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        System.out.println("\nStock update: " + stockName + " price changed to $" + price);
        notifyObservers();
    }
}
