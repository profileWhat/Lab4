package Lab4;

public class Handle extends Item  {
    Handle() {
        super(ItemType.USABLE);
        setDefinition(" Ручка ");
    }
    public void useItem(Human human, Usable instance) {
        instance.use(human);
    }
    public void describeUse(Human human) {
        useItem(human, new Usable() {
            @Override
            public void use(Human human) {
                Describer.describeUseHandle(human);
            }
        });
    }
}
