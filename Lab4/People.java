package Lab4;

public class People implements Movable {
    private final Human[] people;
    People(Human[] people) {
        this.people = people;
    }
    @Override
    public void useMove(Move move) {
        move.use(people);
    }
    public Human[] getHumans() {
        return people;
    }
    public String getPeoplePlaceInLocation() {
        String place = "";
        for(int i = 0;i < people.length;i++) {
            if (people[i] == null) break;
            if (i == 0) {
                place = people[i].getPlaceInLocation();
            } else {
                if (!place.equals(people[i].getPlaceInLocation())) {
                    place = "indefinitely";
                    break;
                }
            }
        }
        return place;
    }
}