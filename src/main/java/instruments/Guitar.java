package instruments;

import enums.*;
import interfaces.IPlay;

public class Guitar implements IPlay {

    private GuitarType guitarType;
    private int stringCount;

    public Guitar(GuitarType guitarType, int stringCount) {
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
