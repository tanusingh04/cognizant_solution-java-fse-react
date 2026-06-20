package AdapterPatternExample;

public class StripeGateway {
    public void chargeCard(double amountInEuros) {
        System.out.println("Charging card with amount EUR " + amountInEuros + " via Stripe Gateway.");
    }
}
