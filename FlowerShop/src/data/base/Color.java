package data.base;

public enum Color {
    RED("red"),
    GREEN("green"),
    BLUE("blue");
    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
