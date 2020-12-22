package Lab4;

public class TurnProjector extends Move {
    private final Projector projector;
    TurnProjector(Projector projector) {
        super(Moves.MOVE_WITH_ITEM);
        this.projector = projector;
    }
    @Override
    protected void describe() {
        Describer.describeMoveTurnProjector(projector);
    }
    @Override
    protected void setEffect(Human human) {
        projector.turnOn();
    }
}
