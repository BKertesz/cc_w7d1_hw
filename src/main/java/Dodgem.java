public class Dodgem extends Attraction implements IChargable {

    public Dodgem(String name) {
        super(name);
    }

    public double priceFor(Visitor visitor){
        if(visitor.getAge()<= 12){
            return 25.0;
        }
        else{
            return 50.0;
        }
    }
}
