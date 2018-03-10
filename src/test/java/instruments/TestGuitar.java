package instruments;

import enums.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuitar {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar(InstrumentColour.RED,
                            InstrumentMake.FENDER,
                            InstrumentMaterial.FIBREGLASS,
                            InstrumentType.STRING,
                            560.00,
                            GuitarType.ELECTRIC,
                            6);
    }

    @Test
    public void canGetType() {
        assertEquals(GuitarType.ELECTRIC, guitar.getGuitarType());
    }

    @Test
    public void canGetStringCount() {
        assertEquals(6, guitar.getStringCount());
    }

    @Test
    public void canPlay() {
        assertEquals("strum strum", guitar.play());
    }
}
