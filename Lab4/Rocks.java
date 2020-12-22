package Lab4;

public class Rocks extends Item {
    private String rockEffect = "";
    private String lightingEffect = "";
    Rocks(String rockEffect, String lightingEffect) {
        super(ItemType.STANDARD);
        this.rockEffect = rockEffect;
        this.lightingEffect = lightingEffect;
        setDefinition(this.rockEffect + " Скалы " + this.lightingEffect);
    }

}
