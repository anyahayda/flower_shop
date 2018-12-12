package data.flower;

import data.base.Color;
import data.base.ComesFrom;
import data.base.Smell;

public class Rose extends Flower {

    public Rose(Color color, ComesFrom country, Smell smell, float price, int length) {
        super(color, country, smell, price, length);
    }

    public static Rose getRandomRose() {
        return new Rose(getRandomColor(), getRandomCountry(), getRandomSmell(), getRandomPrice(), getRandomLength());
    }

    @Override
    public String toString() {
        return "Rose: " +
                "color=" + color +
                ", country=" + country +
                ", smell=" + smell +
                ", price=" + Math.round(price) +
                ", length=" + length +
                ", spikes=Yes";
    }
}
