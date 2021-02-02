package AbstratctFactoryPattern;

public interface AbstractFactory {
    Shape getShape(String s);
    RoundedShape getRoundedShape(String s);
}
