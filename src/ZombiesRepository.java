import java.util.List;

public class ZombiesRepository implements ContainerIterator{

    List<Zombie> zombies;

    public ZombiesRepository(List<Zombie> zombies) {
        this.zombies = zombies;
    }

    @Override
    public Iterator getInterator() {
        return new ZombieIterator();
    }

    private class ZombieIterator implements Iterator {
        private int index;
        private ZombieIterator() {
            this.index = 0;
        }
        @Override
        public boolean hasNext() {
            return index < zombies.size();
        }

        @Override
        public Zombie next() {
            return hasNext() ? zombies.get(index++) : null;
        }
    }
}
