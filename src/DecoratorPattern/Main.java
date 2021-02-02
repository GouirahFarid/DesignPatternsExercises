package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        var coffee=new Caramel(new Espresso());
        System.out.println("coffee cost:"+coffee.cost());
    }
}
