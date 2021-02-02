package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Observable implements IObservable {
    private  int state;
    private List<IObserver> observers=new ArrayList<>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void add(IObserver observer) {
        observers.add(observer);

    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(IObserver::update);
    }
}
