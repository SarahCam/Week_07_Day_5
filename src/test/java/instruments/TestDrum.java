package instruments;

import enums.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDrum {

    Drum drum;

    @Before
    public void setUp() throws Exception {
        drum = new Drum(InstrumentColour.BLACK,
                        InstrumentMake.YAMAHA,
                        InstrumentMaterial.FIBREGLASS,
                        InstrumentType.PERCUSSION,
                        DrumType.SNARE);
    }

    @Test
    public void canGetDrumType() {
        assertEquals(DrumType.SNARE, drum.getDrumType());
    }

    @Test
    public void canPlay() {
        assertEquals("bang bang", drum.play());
    }
}
