package instruments;

import enums.GuitarType;

public class Guitar {

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
}
