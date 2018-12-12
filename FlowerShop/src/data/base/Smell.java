package data.base;

public enum Smell {
    AMAZING("amazing"),
    GREAT("great"),
    WITHOUT("without smell");
    private String smell;

    Smell(String smell) {
        this.smell = smell;
    }

    public String getSmell() {
        return smell;
    }

    @Override
    public String toString() {
        return smell;
    }
}
