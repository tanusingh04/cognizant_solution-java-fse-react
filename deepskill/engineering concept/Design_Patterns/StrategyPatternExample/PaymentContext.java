package StrategyPatternExample;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Allows dynamic changing of payment strategies at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Error: Payment strategy is not set.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
