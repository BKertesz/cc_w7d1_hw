public class Playground extends Attraction implements IRestrictable,IChargable {

    public Playground(String name) {
        super(name);
    }

    public Boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 15){
            return false;
        }
        else{
            return true;
        }
    }

    public double priceFor(Visitor visitor){
        return 0.0;
    }
}
