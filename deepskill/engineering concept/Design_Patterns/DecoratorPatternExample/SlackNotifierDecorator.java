package DecoratorPatternExample;

public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Send previous/core notifications
        sendSlack(message);  // Add Slack message sending feature
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack channel message: " + message);
    }
}
