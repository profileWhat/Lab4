package Lab4;

public class NormalHuman extends Human {
    NormalHuman(String name, Location location) {
        super(HumanType.NORMAL_HUMAN, location);
        this.name = name;
    }
}
