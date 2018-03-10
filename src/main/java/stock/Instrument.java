package stock;

import enums.*;

public class Instrument {

    private InstrumentColour colour;
    private InstrumentMake make;
    private InstrumentMaterial material;
    private InstrumentType type;

    public Instrument(InstrumentColour colour, InstrumentMake make, InstrumentMaterial material, InstrumentType type) {
        this.colour = colour;
        this.make = make;
        this.material = material;
        this.type = type;
    }

    public InstrumentColour getColour() {
        return colour;
    }

    public InstrumentMake getMake() {
        return make;
    }

    public InstrumentMaterial getMaterial() {
        return material;
    }

    public InstrumentType getType() {
        return type;
    }
}
