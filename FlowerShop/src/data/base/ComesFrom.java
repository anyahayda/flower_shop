package data.base;

public enum ComesFrom {
    UKRAINE("UKRAINE"),
    USA("USA"),
    AUSTRIA("AUSTRIA");
    private String country;

    ComesFrom(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return country;
    }
}