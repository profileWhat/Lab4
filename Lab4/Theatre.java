package Lab4;

public class Theatre extends Location {
    Theatre(int peopleMaxQuantity) {
        super(LocationType.THEATRE, peopleMaxQuantity);
        this.theatreScene = new TheatreScene(5, new Stick(), new Handle(), new Curtain(), new Projector("Жёлтый"),
                new Rocks("Мрачные", "в багряном освещении"), new Wardrobe("платяной", true));
    }
    public TheatreScene theatreScene;
    public void action() {
        Describer.describeStartOfTheatreAction();
        People spectator = new People(getPeople());
        theatreScene.setSpectator(spectator);
        theatreScene.performance();
    }
    public static class TheatreScene extends Location {
        TheatreScene(int peopleMaxQuantity, Stick stick, Handle handle, Curtain curtain, Projector projector, Rocks rocks, Wardrobe wardrobe) {
            super(LocationType.THEATRE_SCENE, peopleMaxQuantity);
            this.stick = stick;
            this.handle = handle;
            this.curtain = curtain;
            this.projector = projector;
            this.rocks = rocks;
            this.wardrobe = wardrobe;
        }
        private People spectator;
        private final Stick stick;
        private final Handle handle;
        private final Curtain curtain;
        private final Projector projector;
        private final Rocks rocks;
        private final Wardrobe wardrobe;
        public void performance() {
            Human actorEmma = null;
            Human actorHomsa = null;
            Human actorMoominPapa = null;
            Human actorMisa = null;
            Human actorMulma = null;
            Human[] humansUnderRamp = new Human[50];
            try {
                for (Human person : getPeople()) {
                    if (person == null) break;
                    switch (person.getHumanName()) {
                        case "Emma" -> actorEmma = person;
                        case "Homsa" -> actorHomsa = person;
                        case "Moomin Papa" -> actorMoominPapa = person;
                        case "Misa" -> actorMisa = person;
                        case "Mumla" -> actorMulma = person;
                    }
                }
                if (actorEmma == null || actorHomsa == null || actorMoominPapa == null || actorMisa == null || actorMulma == null)
                    throw new NotEnoughActorException("Не хватает актёров для выступления");
                actorMoominPapa.useMove(new RewritePiece());
                actorMisa.useMove(new Cry());
                actorMisa.useMove(new CramRole());
                actorHomsa.useMove(new TurnProjector(projector));
                actorMisa.useMove(new DropPaper(new Paper()));
                actorMisa.useMove(new Shout("Хомса включил жёлтый проектор"));
                actorEmma.useMove(new PatShoulder(actorHomsa));
                for (int i = 0; i < 3; i++) actorEmma.useMove(new HitTheFloorByStick(stick));
                spectator.useMove(new ShutUp());
                actorEmma.useMove(new TurnHandle(handle, curtain));
                spectator.useMove(new MakeExclamationOfAdmiration());
                spectator.useMove(new See(rocks));
                actorMulma.useMove(new SitToTheRightItem(wardrobe));
                actorMulma.describeDonnedClothing();
                for (Human person : spectator.getHumans()) {
                    if (person == null) break;
                    int humansUnderRampSize = 0;
                    if (person.getPlaceInLocation().equals("За рампой")) {
                        humansUnderRamp[humansUnderRampSize++] = person;
                    }
                }
                People peopleUnderRamp = new People(humansUnderRamp);
                actorMulma.useMove(new See(peopleUnderRamp));
                actorMulma.useMove(new Recite());
            } catch(NotEnoughActorException | NotEnoughItemException e) {
                System.out.println(e.getMessage());
            }
        }
        public void setSpectator(People spectator) {
            this.spectator = spectator;
        }
    }
}
