package Lab4;

public class Skirt extends Item {
    private final String material;
    Skirt(String material) {
        super(ItemType.CLOTHING);
        this.material = material;
        setDefinition(this.material + " Юбка ");
    }
}