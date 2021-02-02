package DecoratorPattern;

public class Caramel extends BeverageDecorator {
    private final Beverage beverage;

    public Caramel(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    double cost() {
        return this.beverage.cost()+3;
    }
}
