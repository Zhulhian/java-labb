package lab4;

public class Player
{
    private int x, y;
    private Speed speed = Speed.MEDIUM;
    private Mode mode = Mode.NORMAL;

    public void setSpeed(Speed newSpeed) {
        this.speed = newSpeed;
    }

    public void setMode(Mode newMode) {
        this.mode = newMode;
    }

    public void moveRight() {
        switch (speed) {
            case SLOW:
                x += 5;
                break;
            case MEDIUM:
                x += 10;
                break;
            case FAST:
                x += 20;
                break;
        }
    }

    /**
     * Describe current speed and mode -- used for a status display
     */
    public String getDescription() {
        StringBuilder buf = new StringBuilder();
        buf.append("Player is ");

        buf.append(speed.toString());

        buf.append(" and ");

        buf.append(mode.toString());

        return buf.toString();
    }

    public static void main(String[] args) {
        final Player player = new Player();
        System.out.println(player.getDescription());
    }
}