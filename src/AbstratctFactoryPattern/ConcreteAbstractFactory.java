package AbstratctFactoryPattern;

public class ConcreteAbstractFactory  implements AbstractFactory{
    @Override
    public Shape getShape(String s) {
        if (s.equals("sq"))
            return new Square();
        if (s.equals("rec"))
            return new Rectangle();
        return null;
    }

    @Override
    public RoundedShape getRoundedShape(String s) {
        if (s.equals("rsq"))
            return new RoundedSquare();
        if (s.equals("2rec"))
            return new RoundedRectangle();
        return null;
    }
}
