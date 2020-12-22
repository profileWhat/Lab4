package Lab4;

public class RewritePiece extends Move {
    RewritePiece() {
        super(Moves.MOVE_WITHOUT_ITEM);
    }
    @Override
    protected void describe() {
        Describer.describeMoveRewritePiece();
    }
}
