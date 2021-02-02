package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        var observable=new Observable();
        var observer1=new ConcreteObserver(observable);
        var observer2=new ConcreteObserver(observable);
        var observer3=new ConcreteObserver(observable);
         observable.setState(2);
         observable.notifyAllObservers();
         observable.setState(1);
        observable.notifyAllObservers();

    }
}
