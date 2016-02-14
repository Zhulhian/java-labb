package lab4;

import java.awt.*;

public class InvulnerablePowerup implements Powerup
{
    public void paint(Graphics g, int x, int y) {
        g.fillOval(x, y, 10, 10);
    }

    @Override
    public void playerHitMe(Player player) {
        player.setMode(Mode.INVULNERABLE);
    }

    @Override public String getDescription() {
        return "Makes a player invulnerable for a while";
    }
}
