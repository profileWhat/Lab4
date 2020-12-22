package Lab4;

public class Wardrobe extends Item {
    private final String material;
    private final Mirror mirror;
    boolean isHiddenUnderBedspread;
    Wardrobe(String material, boolean isHiddenUnderBedspread) {
        super(ItemType.STANDARD);
        this.material = material;
        mirror = new Mirror();
        this.isHiddenUnderBedspread = isHiddenUnderBedspread;
        setDefinition(this.material + " Шкаф с" + this.mirror.getDefinition());
    }
}
