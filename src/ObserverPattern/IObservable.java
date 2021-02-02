package ObserverPattern;

public interface IObservable {
    void add(IObserver observer);
    void remove(IObserver observer);
    void notifyAllObservers();
}
