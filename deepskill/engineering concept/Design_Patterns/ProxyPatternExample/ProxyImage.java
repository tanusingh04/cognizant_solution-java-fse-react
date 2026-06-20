package ProxyPatternExample;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
        // Notice: We do NOT load the image in the constructor. This achieves lazy loading.
    }

    @Override
    public void display() {
        if (realImage == null) {
            // Lazy initialization and caching
            realImage = new RealImage(filename);
        } else {
            System.out.println("Retrieving image '" + filename + "' from local cache.");
        }
        realImage.display();
    }
}
