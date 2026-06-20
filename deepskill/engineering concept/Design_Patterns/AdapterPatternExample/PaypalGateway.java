package AdapterPatternExample;

public class PaypalGateway {
    public void makePayment(double dollarAmount) {
        System.out.println("Processing payment of $" + dollarAmount + " via PayPal Gateway.");
    }
}
