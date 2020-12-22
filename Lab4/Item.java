package Lab4;

import java.util.Objects;

public abstract class Item {
    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != this.getClass())
            return false;
        if(this == obj)
            return true;
        Item other = (Item)obj;
        return this.getDefinition().equals(other.getDefinition());
    }
    @Override
    public String toString() {
        return getClass().getName();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getDefinition());
    }
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
