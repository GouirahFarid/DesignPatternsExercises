package FactoryMethodPattern;

import java.util.stream.Stream;

public class ConcreteShapeFactory implements IShapeFactory {
    @Override
    public Shape getShape(String s) {
        if (s==null)
            return null;
        if (s.equals("square"))
            return  new Square();
        if (s.equals("rectangle"))
            return  new Rectangle();
        return null;
    }
}
