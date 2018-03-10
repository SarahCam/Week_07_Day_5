package stock;

import enums.*;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestInstrument {

    Instrument instrument1;

    @Before
    public void setUp() throws Exception {
        instrument1 = new Piano(InstrumentColour.BLACK,
                                InstrumentMake.STEINWAY,
                                InstrumentMaterial.WOOD,
                                InstrumentType.KEYBOARD,
                                PianoType.GRAND);
    }

    @Test
    public void canGetColour() {
        assertEquals(InstrumentColour.BLACK, instrument1.getColour());
    }

    @Test
    public void canGetMake() {
        assertEquals(InstrumentMake.STEINWAY, instrument1.getMake());
    }

    @Test
    public void canGetMaterial() {
        assertEquals(InstrumentMaterial.WOOD, instrument1.getMaterial());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.KEYBOARD, instrument1.getType());
    }
}
