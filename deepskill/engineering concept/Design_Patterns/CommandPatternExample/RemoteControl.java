package CommandPatternExample;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command == null) {
            System.out.println("Error: No command is assigned to the remote control button.");
            return;
        }
        command.execute();
    }
}
