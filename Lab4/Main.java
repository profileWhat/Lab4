package Lab4;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre(20);
        Human[] people = PeopleCreator.createPeople(theatre);
        Actor emma;
        Actor actorHomsa;
        Actor actorMoominPapa;
        Actor actorMisa;
        Actor actorMumla;
        if (Math.round(Math.random()*10) != 0) {
            emma = new Actor("Emma", theatre.theatreScene);
        } else {
            emma = new Actor("Emma", new Home(2));
        }
        if (Math.round(Math.random()*10) != 0) {
            actorHomsa = new Actor("Homsa", theatre.theatreScene);
        } else {
            actorHomsa = new Actor("Homsa", new Home(3));
        }
        if (Math.round(Math.random()*10) != 0) {
            actorMoominPapa = new Actor("Moomin Papa", theatre.theatreScene);
        } else {
            actorMoominPapa = new Actor("Moomin Papa", new Home(4));
        }
        if (Math.round(Math.random()*10) != 0) {
             actorMisa = new Actor("Misa", theatre.theatreScene);
        } else {
             actorMisa = new Actor("Misa", new Home(5));
        }
        if (Math.round(Math.random()*10) != 0) {
            actorMumla = new Actor("Mumla", theatre.theatreScene);
        } else {
            actorMumla = new Actor("Mumla", new Home(3));
        }
        actorMumla.setClothing(new Skirt("Тюлевая"), new Crown("бумажных цветов"));
        theatre.action();
    }
}
