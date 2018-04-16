public abstract class Attraction implements IEnjoyable {

    private String name;
    private int funRating;

    public Attraction(String name) {
        this.name = name;
        this.funRating = 0;
    }

    public void setFunRating(int funRating) {
        this.funRating = funRating;
    }

    public int getFunRating(){
        return this.funRating;
    }

    public String getName(){
        return this.name;
    }

}
