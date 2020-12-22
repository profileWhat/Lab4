package Lab4;

public class Rise extends Move {
    Rise() {
        super(Moves.MOVE_WITH_ITEM);
    }
    @Override
    protected final void describe() {
        Describer.describeMoveRise();
    }
}
