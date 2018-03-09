package instruments;

import enums.DrumType;

public class Drum {

    private DrumType drumType;

    public Drum(DrumType drumType) {
        this.drumType = drumType;
    }

    public DrumType getDrumType() {
        return drumType;
    }
}
