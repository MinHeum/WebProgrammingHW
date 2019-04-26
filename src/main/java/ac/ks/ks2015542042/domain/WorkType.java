package ac.ks.ks2015542042.domain;

public enum WorkType {
    frontendwork("프론트엔드"),
    backend("백엔드"),
    design("디자인")
    ;
    private String type;

    WorkType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
