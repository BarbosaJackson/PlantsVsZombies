/**
 * Created by Armin on 6/25/2016.
 */
public class NormalZombie extends Zombie implements ChoiceZombie {

    public NormalZombie(GamePanel parent, int lane) {
        super(parent, lane);
    }

    @Override
    public Zombie choiceZombie() {
        return this;
    }
}
