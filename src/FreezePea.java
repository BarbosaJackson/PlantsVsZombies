import java.awt.*;

/**
 * Created by Armin on 6/28/2016.
 */
public class FreezePea extends Pea {

    public FreezePea(GamePanel parent, int lane, int startX) {
        super(parent, lane, startX, 150);
    }

    @Override
    public boolean advance() {
        Rectangle pRect = new Rectangle(getPosX(), 130 + getMyLane() * 120, 28, 28);
        boolean exit = false;
        for (int i = 0; i < gp.getLaneZombies().get(getMyLane()).size(); i++) {
            Zombie z = gp.getLaneZombies().get(getMyLane()).get(i);
            Rectangle zRect = new Rectangle(z.getPosX(), 109 + getMyLane() * 120, 400, 120);
            if (pRect.intersects(zRect)) {
                z.setHealth(z.getHealth() - getDamage());
                z.slow();
                if (z.getHealth() < 0) {
                    System.out.println("ZOMBIE DIE");
                    GamePanel.setProgress(10);
                    gp.getLaneZombies().get(getMyLane()).remove(i);
                    exit = true;
                }
                gp.getLanePeas().get(getMyLane()).remove(this);
                if (exit) break;
            }
        }
        setPosX(getPosX() + 15);
        return false;
    }

}
