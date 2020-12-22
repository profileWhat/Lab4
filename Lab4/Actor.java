package Lab4;

public class Actor extends Human {
    Actor(String name, Location location) {
        super(HumanType.ACTOR, location);
        visitedTheater();
        this.name = name;
    }
}
