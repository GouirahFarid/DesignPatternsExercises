package CommandPattern;

public class Invoker {
    private ICommand lightControl;

    public Invoker(ICommand lightControlICommand) {
        this.lightControl= lightControlICommand;
    }
    public  void  clickOn(){
        this.lightControl.execute();
    }
    public  void clickOff(){
        this.lightControl.unexecute();
    }
}
