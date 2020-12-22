package Lab4;

public class CramRole extends Move {
    CramRole() {
        super(Moves.MOVE_WITHOUT_ITEM);
    }
    @Override
    protected void describe() {
        Describer.describeMoveCramRole();
    }
    @Override
    protected void setEffect(Human human) {
        human.downMood();
    }
}
