package BuilderPatternExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Builder Pattern ===");

        // 1. Basic Office Computer: Only required specs
        Computer officePC = new Computer.Builder("Intel Core i3", "8GB", "256GB SSD")
                .build();
        System.out.println("\nOffice PC configuration:");
        System.out.println(officePC);

        // 2. Gaming Computer: High specs, optional GPU, OS, and WiFi
        Computer gamingPC = new Computer.Builder("AMD Ryzen 9", "32GB", "1TB NVMe SSD")
                .setGPU("NVIDIA RTX 4080")
                .setOS("Windows 11")
                .setWiFiEnabled(true)
                .setBluetoothEnabled(true)
                .build();
        System.out.println("\nGaming PC configuration:");
        System.out.println(gamingPC);

        // 3. Developer Workstation: No GPU, but custom OS and Bluetooth
        Computer devWorkstation = new Computer.Builder("Intel Core i7", "64GB", "2TB SSD")
                .setOS("Ubuntu 22.04 LTS")
                .setBluetoothEnabled(true)
                .build();
        System.out.println("\nDeveloper Workstation configuration:");
        System.out.println(devWorkstation);
    }
}
