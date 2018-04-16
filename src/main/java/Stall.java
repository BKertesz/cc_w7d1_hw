public abstract class Stall implements IChargable, IEnjoyable {

    private String name;
    private String ownerName;
    private int parkingSpot;
    int funRating;

    public Stall(String name, String ownerName, int parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.funRating = 0;

    }

    public void setFunRating(int funRating) {
        this.funRating = funRating;
    }

    public double priceFor(Visitor visitor){
        return 10.0;
    }

    public int getFunRating(){
        return this.funRating;
    }

    public String getName(){
        return this.name;
    }
}
