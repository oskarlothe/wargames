package oskarlothe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArmyTest {
    @Test
    public void testGetRandom() {
        // Testing that an empty instance of Army class will return null
        Army ar = new Army("testArmy");
        assertEquals(null, ar.getRandom());
    }
}
