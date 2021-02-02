package ObserverPattern;

public class ConcreteObserver implements IObserver {
    Observable observable;

    public ConcreteObserver(Observable observable) {
        this.observable = observable;
        this.observable.add(this);
    }

    @Override
    public void update() {
        System.out.println("result:"+this.observable.getState()*2);
    }
}
