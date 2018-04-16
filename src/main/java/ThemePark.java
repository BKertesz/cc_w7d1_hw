import java.util.ArrayList;

public class ThemePark {

    private String name;
    private ArrayList<IEnjoyable> enjoyable;

    public ThemePark(String name, ArrayList<IEnjoyable> enjoyable) {
        this.name = name;
        this.enjoyable = enjoyable;
    }

    public void listAll(){
        for (IEnjoyable item:enjoyable) {
            System.out.println(item.getName() + item.getFunRating());
        }
    }
}
