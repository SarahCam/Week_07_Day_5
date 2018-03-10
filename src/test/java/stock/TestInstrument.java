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
                                5780.00,
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

    @Test
    public void getWholeSalePrice___100Percent() {
        assertEquals(5780.00, instrument1.getWholeSalePrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup___20Percent() {
        assertEquals(1156.00, instrument1.calculateMarkUp(), 0.01);
    }

    @Test
    public void getRetailPrice___WholeSalePricePLUSMarkup___120Percent() {
        assertEquals(6936.00, instrument1.getRetailPrice(), 0.01);
    }
}
