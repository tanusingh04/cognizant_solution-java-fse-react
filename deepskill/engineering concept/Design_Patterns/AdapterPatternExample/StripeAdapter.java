package AdapterPatternExample;

public class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;
    private static final double USD_TO_EUR_RATE = 0.92;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Convert USD amount to EUR for Stripe Gateway
        double amountInEuros = amount * USD_TO_EUR_RATE;
        stripeGateway.chargeCard(amountInEuros);
    }
}
