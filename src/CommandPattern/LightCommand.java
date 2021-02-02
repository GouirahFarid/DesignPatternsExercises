package CommandPattern;

public class LightCommand  implements ICommand{
    private Light  light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.setState("On");
    }

    @Override
    public void unexecute() {
        this.light.setState("Off");

    }
}
