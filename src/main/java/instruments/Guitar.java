package instruments;

import enums.GuitarType;
import interfaces.IPlay;

public class Guitar implements IPlay {

    private GuitarType type;
    private int stringCount;

    public Guitar(GuitarType type, int stringCount) {
        this.type = type;
        this.stringCount = stringCount;
    }

    public GuitarType getType() {
        return type;
    }

    public int getStringCount() {
        return stringCount;
    }

    @Override
    public String play() {
        return "strum strum";
    }
}
