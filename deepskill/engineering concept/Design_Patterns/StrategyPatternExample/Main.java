package StrategyPatternExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Strategy Pattern ===");

        // Create the context
        PaymentContext context = new PaymentContext();

        // 1. Pay using Credit Card
        System.out.println("\n--- Paying with Credit Card ---");
        PaymentStrategy creditCard = new CreditCardPayment(
                "John Doe", "1234567890123456", "123", "12/28"
        );
        context.setPaymentStrategy(creditCard);
        context.executePayment(250.00);

        // 2. Pay using PayPal
        System.out.println("\n--- Paying with PayPal ---");
        PaymentStrategy paypal = new PayPalPayment(
                "johndoe@example.com", "securePassword123"
        );
        context.setPaymentStrategy(paypal);
        context.executePayment(89.99);

        // 3. Error Case: execute payment without strategy
        System.out.println("\n--- Error Case: No Strategy ---");
        PaymentContext emptyContext = new PaymentContext();
        emptyContext.executePayment(10.00);
    }
}
