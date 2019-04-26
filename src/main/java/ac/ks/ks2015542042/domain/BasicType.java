package ac.ks.ks2015542042.domain;

public enum BasicType {
    generalmanager("실장"),
    manager("과장"),
    assistantmanager("대리")
    ;

    private String value;

    BasicType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
