package Lab4;

public class PeopleCreator {
    public static Human[] createPeople(Location location) {
        Human[] people = new Human[10];
        for (int i = 0; i < people.length; i++) {
            people[i] = new NormalHuman("Josh", location);
            if (i > people.length / 2 && Math.round(Math.random()) == 1 && people[i].getCurrentLocation() == LocationType.THEATRE) {
                people[i].visitedTheater();
            }
            if (Math.round(Math.random()) == 1) {
                people[i].setPlaceInLocation("За рампой");
            } else {
                people[i].setPlaceInLocation("Boy next door");
                class Slave extends Human {
                    Slave() {
                        super(HumanType.SLAVE, location);
                        name = "slave";
                    }
                    public void giveThreeHundredBucks() {
                        Describer.describeGiveThreeHundredBucks();
                    }
                    public void fisting() {
                        Describer.describeFisting();
                    }
                }
                Slave slave = new Slave();
                slave.setPlaceInLocation("Boy this door");
                if (Math.round(Math.random() * 10) == 1) slave.fisting();
                if (Math.round(Math.random() * 10) == 1) slave.giveThreeHundredBucks();
            }
        }
        return people;
    }
}
