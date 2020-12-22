package Lab4;

public class Recite extends Move {
    Recite() {
        super(Moves.MOVE_WITHOUT_ITEM);
    }
    @Override
    protected void describe() {
        Describer.describeMoveRecite();
    }
    @Override
    protected void setEffect(Human human) {
        human.killEmbarrass();
    }
}
