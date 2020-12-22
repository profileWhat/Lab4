package Lab4;

public class MakeExclamationOfAdmiration extends Move {
    MakeExclamationOfAdmiration() {
        super(Moves.MOVE_WITHOUT_ITEM);
    }
    @Override
    protected void describe() {
        Describer.describeMoveMakeExclamationOfAdmiration();
    }
    @Override
    protected void setEffect(Human human) {
        if (human.isSpeak()) human.speak();
        if (!human.isHappy()) human.upMood();
    }
}
