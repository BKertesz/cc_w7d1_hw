public class TobaccoStall extends Stall implements IRestrictable {

    public TobaccoStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public Boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() >= 18 ){
            return true;
        }
        else{
            return false;
        }
    }
}
