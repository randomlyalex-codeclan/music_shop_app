import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void setUp() {
        guitar = new Guitar("Stratocaster",1000,400,"black","wood","Electric Guitar", 6, "Right");
    }

    @Test
    public void calculateMarkUp() {
        assertEquals(1.5, guitar.calculateMarkUp(), 0.001);
    }

    @Test
    public void play() {
        assertEquals("Guitar sounds", guitar.play());
    }
}