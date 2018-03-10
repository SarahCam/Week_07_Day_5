package instruments;

import enums.*;
import interfaces.IPlay;

public class Drum implements IPlay {

    private DrumType drumType;

    public Drum(DrumType drumType) {
        this.drumType = drumType;
    }

    public DrumType getDrumType() {
        return drumType;
    }

    @Override
    public String play() {
        return "bang bang";
    }
}
