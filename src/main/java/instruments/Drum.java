package instruments;

import enums.*;
import interfaces.IPlay;
import stock.Instrument;

public class Drum extends Instrument implements IPlay {

    private DrumType drumType;

    public Drum(InstrumentColour colour, InstrumentMake make, InstrumentMaterial material, InstrumentType type, DrumType drumType) {
        super(colour, make, material, type);
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
