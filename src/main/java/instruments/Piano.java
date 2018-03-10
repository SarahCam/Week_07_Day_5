package instruments;

import enums.*;
import interfaces.IPlay;
import stock.Instrument;

public class Piano extends Instrument implements IPlay {

    PianoType pianoType;

    public Piano(InstrumentColour colour, InstrumentMake make, InstrumentMaterial material,
                 InstrumentType type, double wholeSalePrice, PianoType pianoType) {
        super(colour, make, material, type, wholeSalePrice);
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
