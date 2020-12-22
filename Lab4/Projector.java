package Lab4;

public class Projector extends Item {
    private boolean isOn;
    private ProjectorColor projectorColor;
    Projector(String color) {
        super(ItemType.USABLE);
        isOn = false;
        setDefinition(" Прожектор ");
        projectorColor = new ProjectorColor(color);
    }
    public void turnOn() {
        isOn = true;
        class ProjectorOnParameters {
            public void turnDescribe() {
                Describer.describeTurnProjector();
            }
        }
        ProjectorOnParameters projectorOnParameters = new ProjectorOnParameters();
        projectorOnParameters.turnDescribe();
    }
    public ProjectorColor getProjectorColor() {
        return projectorColor;
    }
    public class ProjectorColor {
        ProjectorColor(String color) {
            this.color = color;
        }
        public String getColor() {
            return color;
        }
        private final String color;
    }
}
