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
}
