package Lab4;

public class Shout extends Move {
    private final String phrase;
    Shout(String phrase) {
        super(Moves.MOVE_WITHOUT_ITEM);
        this.phrase = phrase;
    }
    @Override
    protected void describe() {
        Describer.describeMoveShout();
    }
    @Override
    protected void setEffect(Human human) {
        human.speak();
        System.out.println(phrase);
    }
}
