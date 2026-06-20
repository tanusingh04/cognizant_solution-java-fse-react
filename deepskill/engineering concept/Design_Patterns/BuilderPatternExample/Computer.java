package BuilderPatternExample;

public class Computer {
    // Required attributes
    private String CPU;
    private String RAM;
    private String storage;

    // Optional attributes
    private String GPU;
    private String OS;
    private boolean isWiFiEnabled;
    private boolean isBluetoothEnabled;

    // Private constructor taking the Builder as parameter
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.OS = builder.OS;
        this.isWiFiEnabled = builder.isWiFiEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // Getters
    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getStorage() {
        return storage;
    }

    public String getGPU() {
        return GPU;
    }

    public String getOS() {
        return OS;
    }

    public boolean isWiFiEnabled() {
        return isWiFiEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer [" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", Storage='" + storage + '\'' +
                (GPU != null ? ", GPU='" + GPU + '\'' : "") +
                (OS != null ? ", OS='" + OS + '\'' : "") +
                ", WiFi=" + isWiFiEnabled +
                ", Bluetooth=" + isBluetoothEnabled +
                ']';
    }

    // Static nested Builder class
    public static class Builder {
        // Required attributes
        private String CPU;
        private String RAM;
        private String storage;

        // Optional attributes
        private String GPU;
        private String OS;
        private boolean isWiFiEnabled;
        private boolean isBluetoothEnabled;

        // Constructor for Builder with required attributes
        public Builder(String CPU, String RAM, String storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        // Methods to set optional attributes (returning Builder reference for chaining)
        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setOS(String OS) {
            this.OS = OS;
            return this;
        }

        public Builder setWiFiEnabled(boolean isWiFiEnabled) {
            this.isWiFiEnabled = isWiFiEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        // The build method returning the constructed Computer instance
        public Computer build() {
            return new Computer(this);
        }
    }
}
