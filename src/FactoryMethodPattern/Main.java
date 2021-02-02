package FactoryMethodPattern;

public class Main {
    public static void main(String[] args) {
        ConcreteShapeFactory c=new ConcreteShapeFactory();
        var shape1=c.getShape("square");
        var shape2=c.getShape("rectangle");
        shape1.draw();
        shape2.draw();
    }

}
