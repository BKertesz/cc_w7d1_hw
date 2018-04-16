import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    CandyFlossStall candyFlossStall;
    Dodgem dodgem;
    IceCreamStall iceCreamStall;
    Park park;
    Playground playground;
    Rollercoaster rollercoaster;
    TobaccoStall tobaccoStall;

    ThemePark themePark;

    @Before
    public void setUp() throws Exception {
        visitor1 = new Visitor(12,143,100.0);
        visitor2 = new Visitor(15,150,100.0);
        visitor3 = new Visitor(18,175,190.0);

        candyFlossStall = new CandyFlossStall("Candy Floss Stall","Bob",1);
        dodgem = new Dodgem("Dodgem");
        iceCreamStall = new IceCreamStall("IceCream Stall","Bob",2);
        park = new Park("Park");
        playground = new Playground("Playground");
        rollercoaster = new Rollercoaster("Rollercoaster");
        tobaccoStall = new TobaccoStall("TobaccoStall","Bob",3);

        ArrayList<IEnjoyable> startList = new ArrayList<>();
        startList.add(candyFlossStall);
        startList.add(dodgem);
        startList.add(iceCreamStall);
        startList.add(park);
        startList.add(playground);
        startList.add(rollercoaster);
        startList.add(tobaccoStall);

        themePark = new ThemePark("Theme Park",startList);
    }

    @Test
    public void canEnterPlayground() {
        assertEquals(true,playground.isAllowedTo(visitor1));
    }

    @Test
    public void cantEnterPlayground() {
        assertEquals(false,playground.isAllowedTo(visitor3));
    }

    @Test
    public void canBuyTobacco() {
        assertEquals(true,tobaccoStall.isAllowedTo(visitor3));
    }

    @Test
    public void canTBuyTobacco() {
        assertEquals(false,tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void cantRideRollercoaster() {
        assertEquals(false,rollercoaster.isAllowedTo(visitor1));
    }

    @Test
    public void canRideRollercoaster() {
        assertEquals(true,rollercoaster.isAllowedTo(visitor2));
    }

    @Test
    public void kidsPrice() {
        assertEquals(25.0,dodgem.priceFor(visitor1),0.1);
    }

    @Test
    public void fullPrice() {
        assertEquals(50.0,rollercoaster.priceFor(visitor3),0.1);
    }

    @Test
    public void buySomething() {
        assertEquals(10.0,iceCreamStall.priceFor(visitor3),0.1);
    }

    @Test
    public void printEnjoyableList() {
        themePark.listAll();
    }
}
