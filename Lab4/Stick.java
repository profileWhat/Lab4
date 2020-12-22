package Lab4;

public class Stick extends Item {
    Stick() {
        super(ItemType.USABLE);
        setDefinition(" Палка ");
    }
    public void useItem(Human human, Usable instance) {
        instance.use(human);
    }
    public void describeUse(Human human) {
        useItem(human, human1 -> Describer.describeUseStick(this, human1));
    }
}
