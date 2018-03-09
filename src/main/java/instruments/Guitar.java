package instruments;

import enums.GuitarType;

public class Guitar {

    private GuitarType guitarType;

    public Guitar(GuitarType guitarType) {
        this.guitarType = guitarType;
    }

    public GuitarType getType() {
        return guitarType;
    }
}
