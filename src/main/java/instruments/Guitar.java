package instruments;

import enums.*;
import interfaces.IPlay;
import stock.Instrument;

public class Guitar extends Instrument implements IPlay {

    private GuitarType guitarType;
    private int stringCount;

    public Guitar(InstrumentColour colour, InstrumentMake make, InstrumentMaterial material, InstrumentType type, GuitarType guitarType, int stringCount) {
        super(colour, make, material, type);
        this.guitarType = guitarType;
        this.stringCount = stringCount;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public int getStringCount() {
        return stringCount;
    }

    @Override
    public String play() {
        return "strum strum";
    }
}
