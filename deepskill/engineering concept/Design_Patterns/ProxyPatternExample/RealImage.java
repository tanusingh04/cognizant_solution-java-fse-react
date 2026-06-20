package ProxyPatternExample;

public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromRemoteServer();
    }

    private void loadFromRemoteServer() {
        System.out.println("Loading image '" + filename + "' from remote server (heavy network operation)...");
        try {
            // Simulate network latency
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Image '" + filename + "' loaded successfully.");
    }

    @Override
    public void display() {
        System.out.println("Rendering and displaying image: " + filename);
    }
}
