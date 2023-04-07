package enums;

public enum SousMenuBtns {

    // Annuaire PS Page
    RECHERCHER_MODIFIER_PS("Rechercher/Modifier PS"),
    CREER_UN_PS("Créer un PS"),
    CONVENTIONS("Conventions"),
    CARTOGRAPHIE("Cartographie"),
    RECHERCHE_PAR_RIB("Recherche par RIB"),
    EVENEMENTS_PS("Événements PS"),
    REFERENCEMENT_PS("Référencement PS"),

    // Tiers Creancier Page
    RECHERCHER_MODIFIER_TC("Rechercher/Modifier TC"),
    CREATION_D_UN_TC("Création d'un TC");

    private final String buttonName;

    SousMenuBtns(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonName() {
        return buttonName;
    }
}
