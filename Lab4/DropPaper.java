package Lab4;

public class DropPaper extends Move {
    Paper paper;
    DropPaper(Paper item) {
        super(Moves.MOVE_WITH_ITEM);
        this.paper = item;
    }
    @Override
    protected void describe() {
        Describer.describeMoveDropPaper();
    }
    @Override
    protected void setEffect(Human human) {
        paper.useMove(new Fall());
    }
}
