package Lab4;

public class ShutUp extends Move {
    ShutUp() {
        super(Moves.MOVE_WITHOUT_ITEM);
    }
    @Override
    protected void describe() {
        Describer.describeMoveShutUp();
    }
    @Override
    protected void setEffect(Human human) {
        if (human.isSpeak()) human.stopSpeak();
    }
}
