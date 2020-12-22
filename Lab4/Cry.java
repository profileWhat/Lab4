package Lab4;

public class Cry extends Move {
    Cry() {
        super(Moves.MOVE_WITHOUT_ITEM);
    }
    @Override
    protected void describe() {
        Describer.describeMoveCry();
    }
    @Override
    protected void setEffect(Human human) {
        human.downMood();
    }
}

