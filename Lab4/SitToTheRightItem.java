package Lab4;

public class SitToTheRightItem extends Move {
    private final Item item;
    SitToTheRightItem(Item item) {
        super(Moves.MOVE_WITH_ITEM);
        this.item = item;
    }
    @Override
    protected void describe() {
        Describer.describeMoveSitToTheRightItem(item);
    }
}
