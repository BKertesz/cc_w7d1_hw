import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgem dodgem;

    @Before
    public void setUp() throws Exception {
        dodgem = new Dodgem("Dodgem");
    }

    @Test
    public void hasName() {
        assertEquals("Dodgem",dodgem.getName());
    }
}
