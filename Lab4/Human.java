package Lab4;

import java.util.Objects;

public abstract class Human implements Movable {
    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != this.getClass())
            return false;
        if(this == obj)
            return true;
        Human other = (Human)obj;
        return this.humanType.equals(other.humanType);
    }
    @Override
    public String toString() {
        return getClass().getName();
    }
    @Override
    public int hashCode() {
        return Objects.hash(humanType);
    }
    String name;
    private final HumanType humanType;
    private boolean isSpeak;
    private boolean isHappy;
    private boolean wasInTheater;
    private boolean isSure;
    private boolean isEmbarrass;
    private Location currentLocation;
    private Item[] clothing;
    private int donnedClothing;
    private String placeInLocation;
    Human(HumanType humanType, Location location) {
        this.humanType = humanType;
        currentLocation = location;
        isSure = false;
        isEmbarrass = false;
        location.addHuman(this);
        this.clothing = new Item[10];
        donnedClothing = 0;
        placeInLocation = "location";
    }
    public HumanType getHumanType() {
        return humanType;
    }
    public String getHumanName() {
        return name;
    }
    public LocationType getCurrentLocation() {
        return currentLocation.getLocationType();
    }
    public void visitedTheater() {
        wasInTheater = true;
    }
    public boolean isHappy() {
        return this.isHappy;
    }
    public boolean isSpeak() {
        return this.isSpeak;
    }
    public final void speak() {
        isSpeak = true;
    }
    public final void stopSpeak() {
        isSpeak = false;
    }
    public final void downMood() {
        isHappy = false;
    }
    public final void upMood() {
        isHappy = true;
    }
    public void killEmbarrass() {
        this.isEmbarrass = false;
    }
    public void setPlaceInLocation(String place) {
        placeInLocation = place;
    }
    public String getPlaceInLocation() {
        return placeInLocation;
    }
    public Item[] getClothing() {
        return clothing;
    }
    public void setClothing(Item... items) {
        for(Item item: items) {
            if (item.getItemType() == ItemType.CLOTHING) {
                clothing[donnedClothing++] = item;
            }
        }
    }
    public void describeDonnedClothing() {
        Describer.describeHumanDonnedClothing(this, clothing, donnedClothing);
    }
    @Override
    public final void useMove(Move move) {
        move.use(this);
    }
}
