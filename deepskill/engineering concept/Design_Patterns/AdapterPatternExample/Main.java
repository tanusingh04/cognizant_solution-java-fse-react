package AdapterPatternExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Adapter Pattern ===");

        // 1. Using PayPal Gateway through Adapter
        PaypalGateway paypalGateway = new PaypalGateway();
        PaymentProcessor paypalProcessor = new PaypalAdapter(paypalGateway);
        
        System.out.println("\n--- Processing payment through PayPal ---");
        paypalProcessor.processPayment(150.00);

        // 2. Using Stripe Gateway through Adapter
        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);
        
        System.out.println("\n--- Processing payment through Stripe ---");
        stripeProcessor.processPayment(150.00);
    }
}
