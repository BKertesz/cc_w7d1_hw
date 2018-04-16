import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Playground");
        playground.setFunRating(4);
    }

    @Test
    public void hasName() {
        assertEquals("Playground",playground.getName());
    }
}
