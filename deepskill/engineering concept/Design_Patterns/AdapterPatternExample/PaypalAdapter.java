package AdapterPatternExample;

public class PaypalAdapter implements PaymentProcessor {
    private PaypalGateway paypalGateway;

    public PaypalAdapter(PaypalGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Translate the target call to Paypal-specific method
        paypalGateway.makePayment(amount);
    }
}
