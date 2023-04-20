package enums;

public enum VisionTypes {

    VISION_DE_LOIN("Vision de loin"),
    VISION_DE_PRES("Vision de près"),
    MI_DISTANCE("Mi-distance"),
    PROGRESSIFS("Progressifs"),
    VERRES_MULTIFOCAUX("Verres multifocaux (double foyer / triple foyer)");

    private final String type;

    VisionTypes(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
