package data.flower;

import data.base.Color;
import data.base.ComesFrom;
import data.base.Smell;

public class Tulip extends Flower {

    public Tulip(Color color, ComesFrom country, Smell smell, float price, int length) {
        super(color, country, smell, price, length);
    }

    public static Tulip getRandomTulip() {
        return new Tulip(getRandomColor(), getRandomCountry(), getRandomSmell(), getRandomPrice(), getRandomLength());
    }

    @Override
    public String toString() {
        return "Tulip: " +
                "color=" + color +
                ", country=" + country +
                ", smell=" + smell +
                ", price=" + Math.round(price) +
                ", length=" + length +
                ", spikes=No";
    }
}
