package ac.ks.ks2015542042.domain;

public enum LocationType {
    office("사무실"),
    laboratory("실험실")
    ;
    private String value;

    LocationType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
