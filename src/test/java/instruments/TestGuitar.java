package instruments;

import enums.GuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuitar {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(GuitarType.ACCOUSTIC);
    }

    @Test
    public void canGetGuitarType() {
        assertEquals(GuitarType.ACCOUSTIC, guitar.getType());
    }
}
