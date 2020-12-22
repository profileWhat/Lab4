package Lab4;

public class TurnHandle extends Move {
    Handle usableHandle;
    Curtain curtain;
    TurnHandle(Handle handle, Curtain curtain) {
        super(Moves.MOVE_WITH_ITEM);
        this.usableHandle = handle;
        this.curtain = curtain;
    }
    @Override
    protected void describe() {
        Describer.describeMoveTurnHandle();
    }
    @Override
    protected void setEffect(Human human) throws NotEnoughItemException {
        if (!human.isHappy()) human.upMood();
        if (usableHandle == null || curtain == null) {
            throw new NotEnoughItemException("Нет ручки или завнавеса");
        } else {
            usableHandle.describeUse(human);
            curtain.useMove(new Rise());
            curtain.open();
        }
    }
}
