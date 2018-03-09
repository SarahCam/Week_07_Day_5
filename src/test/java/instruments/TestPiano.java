package instruments;

import enums.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPiano {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano(PianoType.UPRIGHT);
    }

    @Test
    public void canGetPianoType() {
        assertEquals(PianoType.UPRIGHT, piano.getPianoType());
    }
}
