package Lab4;

public class Describer {
    protected static void describeMoveCry() {
        System.out.println("Плачет");
    }
    protected static void describeMoveHitTheFloorByStick(Stick stick) {
        System.out.println("Ударил(а) " + stick.getDefinition() + " об пол");
    }
    protected static void describeMoveDropPaper() {
        System.out.println("Бросает листок");
    }
    protected static void describeMoveFall() {
        System.out.println("Падает");
    }
    protected static void describeMoveCramRole() {
        System.out.println("Зубрит роль");
    }
    protected static void describeMoveMakeExclamationOfAdmiration() {
        System.out.println("Издают возгласы восхищения");
    }
    protected static void describeMovePatShoulder(Human human) {
        System.out.println("Похлопал(а) " + human.getHumanName() + " по плечу");
    }
    protected static void describeMoveEffectPatShoulder(Human human) {
        System.out.println(human.getHumanName() + " был Похлопан по плечу " + human.getHumanName());
    }
    protected static void describeMoveRecite() {
        System.out.println("быстро декламирует");
    }
    protected static void describeMoveRewritePiece() {
        System.out.println("Переписывает пьесу");
    }
    protected static void describeMoveRise() {
        System.out.println("Поднимается");
    }
    protected static void describeMoveSee(Move move, Item[] items, People people) {
        System.out.println("смотрел(и) на");
        if (move.getMoveType() == Moves.MOVE_WITH_ITEM) {
            for (Item item : items) {
                System.out.println(item.getDefinition());
            }
        } else {
            System.out.println("мнгновенье с интересом на Людей " + people.getPeoplePlaceInLocation());
        }
    }
    protected static void describeMoveShout() {
        System.out.println("Кричит");
    }
    protected static void describeMoveShutUp() {
        System.out.println("Кричит");
    }
    protected static void describeMoveSitToTheRightItem(Item item) {
        System.out.println("Сидит правее " + item.getDefinition());
    }
    protected static void describeMoveTurnHandle() {
        System.out.println("Крутит ручку, поднимая занавес");
    }
    protected static void describeUseStick(Item item, Human human) {
        System.out.println(item.getDefinition() + " Используется " + human.getHumanName());
    }
    protected static void describeUseHandle(Human human) {
        System.out.println(new Handle().getDefinition() + " Используется " + human.getHumanName());
    }
    protected static void describeStartOfTheatreAction() {
        System.out.println("Происходит Генеральная репетиция");
    }
    protected static void describeHumanDonnedClothing(Human human, Item[] clothing, int donnedClothing) {
        System.out.println(human.getHumanName() + " одет в ");
        for(int i = 0;i < donnedClothing;i++) {
            System.out.println(clothing[i].getDefinition());
        }
    }
    protected static void describeMovedHuman(Human human) {
        System.out.println(human.getHumanName());
    }
    protected static void describeMovedPeople() {
        System.out.println("People");
    }
    protected static void describeUsedItem(Item item) {
        System.out.println(item.getDefinition());
    }
    protected static void describeTurnProjector() {
        System.out.println("Прожектор включается");
    }
    protected static void describeGiveThreeHundredBucks() {
        System.out.println("Slave дал 300 баксов");
    }
    protected  static void describeFisting() {
        System.out.println("Fisting Boy next door");
    }
    protected static void describeMoveTurnProjector(Projector projector) {
        System.out.println("Включил " +projector.getProjectorColor().getColor() + " прожектор");
    }
}
