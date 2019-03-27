/**
 * Created by Armin on 6/29/2016.
 */
public class ConeHeadZombie extends Zombie implements ChoiceZombie{

    public ConeHeadZombie(GamePanel parent, int lane) {
        super(parent, lane);
        setHealth(1800);
    }

    @Override
    public Zombie choiceZombie() {
        return this;
    }
}
