package Lab4;

public class Curtain extends Item implements Movable {
    Curtain() {
        super(ItemType.STANDARD);
        isOpen = false;
        setDefinition(" Занавес ");
    }
    @Override
    public void useMove(Move move) {
        move.use(this);
    }
    public void open() {
        this.isOpen = true;
    }
    private boolean isOpen;
}
