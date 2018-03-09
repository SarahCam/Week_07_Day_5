package instruments;

import enums.PianoType;

public class Piano {

    PianoType pianoType;

    public Piano(PianoType pianoType) {
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }
}
