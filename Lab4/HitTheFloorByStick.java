package Lab4;

public class HitTheFloorByStick extends Move {
    Stick stick;
    HitTheFloorByStick(Stick stick) {
        super(Moves.MOVE_WITH_ITEM);
        this.stick = stick;
    }
    @Override
    protected void describe() {
        Describer.describeMoveHitTheFloorByStick(stick);
    }
    @Override
    protected void setEffect(Human human) {
        stick.describeUse(human);
    }
}
