package instruments;

import enums.PianoType;
import interfaces.IPlay;

public class Piano implements IPlay {

    PianoType pianoType;

    public Piano(PianoType pianoType) {
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    @Override
    public String play() {
        return "plink plonk";
    }
}
