package ac.ks.ks2015542042.domain;

public enum ProfileType {
    sns("소셜미디어"),
    blog("블로그"),
    homepage("홈페이지")
    ;
    private String value;

    ProfileType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
