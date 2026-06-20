package SingletonPatternExample;

public class Logger {
    // 1. Private static instance of the class
    private static volatile Logger instance;

    // 2. Private constructor to prevent instantiation from other classes
    private Logger() {
        // Prevent instantiation via reflection API
        if (instance != null) {
            throw new IllegalStateException("Instance already created. Use getInstance() method.");
        }
    }

    // 3. Public static method to provide global access point
    // Double-checked locking pattern for thread safety and high performance
    public static Logger getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (Logger.class) {
                if (instance == null) { // Second check (with locking)
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // A log method to demonstrate utility functions
    public void log(String message) {
        System.out.println("[LOG] " + System.currentTimeMillis() + " - " + message);
    }
}
