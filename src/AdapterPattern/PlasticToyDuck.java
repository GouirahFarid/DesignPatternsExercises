package AdapterPattern;

public class PlasticToyDuck  implements ToyDuck{
    @Override
    public void squeak() {
        System.out.println("squeak squeak");
    }
}
