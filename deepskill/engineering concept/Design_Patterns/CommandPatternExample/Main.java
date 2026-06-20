package CommandPatternExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Command Pattern ===");

        // 1. Create Receiver
        Light livingRoomLight = new Light();

        // 2. Create Commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // 3. Create Invoker
        RemoteControl remote = new RemoteControl();

        // Test Light On Command
        System.out.println("\n--- Pressing button to turn Light On ---");
        remote.setCommand(lightOn);
        remote.pressButton();

        // Test Light Off Command
        System.out.println("\n--- Pressing button to turn Light Off ---");
        remote.setCommand(lightOff);
        remote.pressButton();

        // Error case: press button with no command set
        System.out.println("\n--- Pressing button with no Command set ---");
        RemoteControl rawRemote = new RemoteControl();
        rawRemote.pressButton();
    }
}
