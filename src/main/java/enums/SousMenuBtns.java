package enums;

public enum AnnuairePSSousMenuBtns {

    // Annuaire PS Page
    RECHERCHER_MODIFIER_PS("Rechercher/Modifier PS"),
    CREER_UN_PS("Créer un PS"),
    CONVENTIONS("Conventions"),
    CARTOGRAPHIE("Cartographie"),
    RECHERCHE_PAR_RIB("Recherche par RIB"),
    EVENEMENTS_PS("Événements PS"),
    REFERENCEMENT_PS("Référencement PS");

    private final String buttonName;

    AnnuairePSSousMenuBtns(String buttonName) {
        this.buttonName = buttonName;
    }

    public String getButtonName() {
        return buttonName;
    }
}
