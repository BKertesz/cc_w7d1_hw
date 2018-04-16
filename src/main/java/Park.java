public class Park extends Attraction implements IChargable {

    public Park(String name) {
        super(name);
    }

    public double priceFor(Visitor visitor) {
        return 0;
    }

}
