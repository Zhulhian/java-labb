package lab4;

public enum Speed {
    SLOW("SLOW"), MEDIUM("MEDIUM"), FAST("FAST");

    public final String speed;

    Speed(String s) {
        this.speed = s;
    }

    @Override
    public String toString() {
        return this.speed;
    }

    public String getSpeed() {
        return speed;
    }


}
