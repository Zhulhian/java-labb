package lab4;

import java.awt.*;

public class SpeedPowerup implements Powerup
{
    @Override public String getDescription() {
        return "Makes a player faster";
    }

    @Override
    public void playerHitMe(Player player) {
        player.setSpeed(Speed.FAST);
    }

    public void paint(Graphics g, int x, int y) {
        g.fillRect(x, y, 10, 10);
    }
}