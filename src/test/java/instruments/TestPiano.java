package instruments;

import enums.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPiano {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(InstrumentColour.BROWN,
                InstrumentMake.STEINWAY,
                InstrumentMaterial.WOOD,
                InstrumentType.KEYBOARD,
                PianoType.UPRIGHT);
    }

    @Test
    public void canGetPianoType() {
        assertEquals(PianoType.UPRIGHT, piano.getPianoType());
    }

    @Test
    public void canPlay() {
        assertEquals("plink plonk", piano.play());
    }
}
