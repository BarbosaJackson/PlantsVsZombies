public enum StrategyZombies {

    NORMAL {
        public ChoiceZombie getChoiceZombie(GamePanel parent, int lane){
            return new NormalZombie(parent, lane);
        }
    },
    CONEHEAD {
        public ChoiceZombie getChoiceZombie(GamePanel parent, int lane){
            return new ConeHeadZombie(parent, lane);
        }
    };

    public abstract ChoiceZombie getChoiceZombie(GamePanel parent, int lane);

}
