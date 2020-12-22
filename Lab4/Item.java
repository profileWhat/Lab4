package Lab4;

public abstract class Item {
    private final ItemType itemType;
    private String definition = "Item";
    Item(ItemType itemType) {
        this.itemType = itemType;
    }
    public ItemType getItemType() {
        return itemType;
    }
    public String getDefinition() {
        return definition;
    }
    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
