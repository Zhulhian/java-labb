package lab4;

public enum Mode {
    NORMAL("NORMAL"), GHOST("GHOST"), INVULNERABLE("INVULNERABLE");

    public final String mode;

    Mode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return mode;
    }

    public String getMode() {
        return mode;
    }
}
