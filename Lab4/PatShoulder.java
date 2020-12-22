package Lab4;

public class PatShoulder extends Move {
    Human human;
    PatShoulder(Human human) {
        super(Moves.MOVE_WITHOUT_ITEM);
        this.human = human;
    }
    @Override
    protected final void describe() {
        Describer.describeMovePatShoulder(human);
    }
    @Override
    protected void setEffect(Human human) {
        Describer.describeMoveEffectPatShoulder(human);
    }
}
