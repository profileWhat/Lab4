package Lab4;

public class Paper extends Item implements Movable {
    Paper() {
        super(ItemType.STANDARD);
        setDefinition(" Лист ");
    }
    @Override
    public void useMove(Move move) {
        move.use(this);
    }
}
