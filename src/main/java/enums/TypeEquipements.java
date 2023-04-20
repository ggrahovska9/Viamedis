package enums;

public enum TypeEquipements {

    LUNETTES("Lunettes"),
    LENTILLES("Lentilles");

    private final String type;

    TypeEquipements(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
