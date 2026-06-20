package SingletonPatternExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Singleton Pattern (Logger) ===");

        // Get two instances of the Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Check if both references point to the same object
        System.out.println("Logger 1 reference: " + logger1);
        System.out.println("Logger 2 reference: " + logger2);

        if (logger1 == logger2) {
            System.out.println("Success: Both references point to the same instance!");
        } else {
            System.out.println("Failure: Different instances were created.");
        }

        // Test logging functionality
        logger1.log("This is a log message from logger1.");
        logger2.log("This is a log message from logger2.");
    }
}
