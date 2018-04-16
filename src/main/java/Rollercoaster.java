public class Rollercoaster extends Attraction implements IRestrictable, IChargable {

    public Rollercoaster(String name) {
        super(name);
    }

    public Boolean isAllowedTo(Visitor visitor){
        if((visitor.getHeight()>=145)&&(visitor.getAge()>=12)){
            return true;
        }
        else{
            return false;
        }
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
