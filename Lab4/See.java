package Lab4;

public class See extends Move {
    private Item[] items;
    private People people;
    See(People people) {
        super(Moves.MOVE_WITHOUT_ITEM);
        this.people = people;
    }
    See(Item... items) {
        super(Moves.MOVE_WITH_ITEM);
        this.items = items;
    }
    @Override
    protected void describe() {
        Describer.describeMoveSee(this, items, people);
    }
}
