package Lab4;

import java.util.Objects;

public abstract class Move {
    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != this.getClass())
            return false;
        if(this == obj)
            return true;
        Move other = (Move)obj;
        return this.moveType.equals(other.moveType);
    }
    @Override
    public String toString() {
        return getClass().getName();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getMoveType());
    }
    protected final Moves getMoveType() {
        return moveType;
    }
    private final Moves moveType;
    Move(Moves moveType) {
        this.moveType = moveType;
    }
    protected abstract void describe();
    protected void setEffect(Human human) {
        //nothing
    }
    public void use(Human human) {
        Describer.describeMovedHuman(human);
        describe();
        setEffect(human);
    }
    public void use(Item item) {
        Describer.describeUsedItem(item);
        describe();
    }
    public void use(Human[] human) {
        Describer.describeMovedPeople();
        describe();
        for(Human person: human) {
            if (person == null) break;
            setEffect(person);
        }
    }
}
