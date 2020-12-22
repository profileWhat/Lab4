package Lab4;

public class Crown extends Item {
    private final String material;
    private final String itemPlace;
    Crown(String material) {
        super(ItemType.CLOTHING);
        this.material = material;
        setDefinition("Венец из " + this.material);
        itemPlace = "Макушка";
    }
}
