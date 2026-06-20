package DecoratorPatternExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Decorator Pattern ===");

        // 1. Basic Notifier (Email only)
        System.out.println("\n--- Case 1: Standard Email Notifier ---");
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("System Update: Server will undergo maintenance at midnight.");

        // 2. Email + SMS Notifier
        System.out.println("\n--- Case 2: Email + SMS Notifier ---");
        Notifier smsAndEmailNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsAndEmailNotifier.send("Alert: CPU usage exceeded 90%!");

        // 3. Email + SMS + Slack Notifier (Fully decorated)
        System.out.println("\n--- Case 3: Email + SMS + Slack Notifier ---");
        Notifier fullyDecoratedNotifier = new SlackNotifierDecorator(
                new SMSNotifierDecorator(
                        new EmailNotifier()
                )
        );
        fullyDecoratedNotifier.send("Critical Alert: Database connection lost!");
    }
}
