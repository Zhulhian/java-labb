package lab4;

import java.awt.*;

public class GhostPowerup implements Powerup
{
    public void paint(Graphics g, int x, int y) {
        g.fillOval(x, y, 10, 10);
    }

    @Override
    public void playerHitMe(Player player) {
        player.setMode(Mode.GHOST);
    }

    @Override public String getDescription() {
        return "Makes a player into a ghost that can travel through walls";
    }
}
