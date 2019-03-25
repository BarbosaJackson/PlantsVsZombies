/**
 * Created by Armin on 6/25/2016.
 */
public abstract class Plant {

    private double health = 200;

    private int x;
    private int y;
    private double damage;

    private GamePanel gp;


    public Plant(GamePanel parent, int x, int y, double damage) {
        this.x = x;
        this.y = y;
        gp = parent;
        this.damage = damage;
    }

    public Plant(GamePanel parent, int x, int y) {
        this.x = x;
        this.y = y;
        gp = parent;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getDamage() {
        return this.damage;
    }

    public void stop() {
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public GamePanel getGp() {
        return gp;
    }

    public void setGp(GamePanel gp) {
        this.gp = gp;
    }
}
