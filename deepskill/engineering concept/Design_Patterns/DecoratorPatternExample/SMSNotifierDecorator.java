package DecoratorPatternExample;

public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Send previous/core notifications
        sendSMS(message);    // Add SMS sending feature
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS notification: " + message);
    }
}
