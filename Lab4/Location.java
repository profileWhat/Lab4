package Lab4;

import java.util.Objects;

public abstract class Location {
    @Override
    public boolean equals(Object obj) {
        if(obj == null || obj.getClass() != this.getClass())
            return false;
        if(this == obj)
            return true;
        Location other = (Location)obj;
        return this.locationType.equals(other.locationType);
    }
    @Override
    public String toString() {
        return getClass().getName();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getLocationType());
    }
    private final LocationType locationType;
    private final Human[] people;
    private int peopleQuantity;
    Location(LocationType locationType, int peopleMaxQuantity) {
        this.locationType = locationType;
        people = new Human[peopleMaxQuantity];
        peopleQuantity = 0;
    }
    public LocationType getLocationType() {
        return locationType;
    }
    public void addHuman(Human human) {
        people[peopleQuantity++] = human;
    }
    public Human[] getPeople() {
        return people;
    }
}
