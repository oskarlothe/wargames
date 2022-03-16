package oskarlothe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CavalryUnitTest {
    @Test
    public void testValidParameters() {
        // Testing that an instance of CavalryUnit gets the right fields
        Unit c1 = new CavalryUnit("Oskar", 100);
        assertEquals("Oskar", c1.getName());
        assertEquals(100, c1.getHealth());
    }
}
