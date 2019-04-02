import java.awt.*;

/**
 * Created by Armin on 6/25/2016.
 */
public class Pea {

    private int posX;
    protected GamePanel gp;
    private int myLane;
    private double damage;

    public Pea(GamePanel parent, int lane, int startX, double damage) {
        this.gp = parent;
        this.myLane = lane;
        this.damage = damage;
        posX = startX;
    }

    public double getDamage() {
        return damage;
    }

    public boolean advance() {
        Rectangle pRect = new Rectangle(posX, 130 + myLane * 120, 28, 28);
        for (int i = 0; i < gp.getLaneZombies().get(myLane).size(); i++) {
            Zombie z = gp.getLaneZombies().get(myLane).get(i);
            Rectangle zRect = new Rectangle(z.getPosX(), 109 + myLane * 120, 400, 120);
            if (pRect.intersects(zRect)) {
                System.out.println(z.getHealth());
                z.setHealth(z.getHealth() - getDamage());
                if (z.getHealth() <= 0) {
                    System.out.println("ZOMBIE DIED");
                    gp.getLaneZombies().get(myLane).remove(i);
                    GamePanel.setProgress(10);
                }
//                gp.getLaneZombies().get(myLane).remove(this);
//                posX += 15;
                gp.getLanePeas().get(myLane).remove(this);
                return true;

            }
        }
        /*if(posX > 2000){
            gp.lanePeas.get(myLane).remove(this);
        }*/
        posX += 15;
        return false;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getMyLane() {
        return myLane;
    }

    public void setMyLane(int myLane) {
        this.myLane = myLane;
    }
}
