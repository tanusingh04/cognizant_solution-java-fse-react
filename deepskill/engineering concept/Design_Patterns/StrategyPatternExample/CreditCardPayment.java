package StrategyPatternExample;

public class CreditCardPayment implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardPayment(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount +
                " using Card: " + maskCardNumber(cardNumber));
    }

    private String maskCardNumber(String number) {
        if (number == null || number.length() < 4) {
            return "****";
        }
        return "****-****-****-" + number.substring(number.length() - 4);
    }
}
