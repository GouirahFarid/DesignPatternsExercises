package CommandPattern;

public class Main {
    public static void main(String[] args) {
        var light =new Light();
        var lightInvoker=new Invoker(new LightCommand(light));
        lightInvoker.clickOn();
        System.out.println(light.getState());
        lightInvoker.clickOff();
        System.out.println(light.getState());

    }
}
