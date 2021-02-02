package AdapterPattern;

public class BirdAdapter  implements ITarget {
    private Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        this.bird.makeSound();
    }
}
