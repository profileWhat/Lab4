package Lab4;

public class Fall extends Move {
    Fall() {
        super(Moves.MOVE_WITHOUT_ITEM);
    }
    @Override
    protected void describe() {
        Describer.describeMoveFall();
    }
}
