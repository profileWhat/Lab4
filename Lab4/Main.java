package Lab4;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre(20);
        Human[] people = PeopleCreator.createPeople(theatre);
        Actor emma = new Actor("Emma", theatre.theatreScene);
        Actor emmaHomsa = new Actor("Homsa", theatre.theatreScene);
        Actor actorMoominPapa = new Actor("Moomin Papa", theatre.theatreScene);
        Actor actorMisa = new Actor("Misa", theatre.theatreScene);
        Actor actorMumla = new Actor("Mumla", theatre.theatreScene);
        actorMumla.setClothing(new Skirt("Тюлевая"), new Crown("бумажных цветов"));
        theatre.action();
    }
}
