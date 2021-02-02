package AbstratctFactoryPattern;

public class Main {
    public static void main(String[] args) {
        var caf=new ConcreteAbstractFactory();
        var shape=caf.getShape("sq");
        var roundedShape=caf.getRoundedShape("rsq");
        shape.draw();
        roundedShape.draw();
        var shape2=caf.getShape("rec");
        var roundedShape2=caf.getRoundedShape("2rec");
        shape2.draw();
        roundedShape2.draw();
    }
}
