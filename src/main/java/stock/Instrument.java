package stock;

import enums.*;
import interfaces.ISell;

public class Instrument implements ISell {

    private InstrumentColour colour;
    private InstrumentMake make;
    private InstrumentMaterial material;
    private InstrumentType type;
    private double wholeSalePrice;
    private double retailPrice;

    public Instrument(InstrumentColour colour, InstrumentMake make, InstrumentMaterial material, InstrumentType type, double wholeSalePrice) {
        this.colour = colour;
        this.make = make;
        this.material = material;
        this.type = type;
        this.wholeSalePrice = wholeSalePrice;
        this.retailPrice = 0;                    // Initialize to zero/null until we have calculated the markup
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

    public double getWholeSalePrice() {
        return wholeSalePrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    @Override
    public double calculateMarkUp() {
        return wholeSalePrice * 120/100;
    }
}
