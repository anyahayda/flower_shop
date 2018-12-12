package data.flower;

import data.base.Color;
import data.base.ComesFrom;
import data.base.Smell;

public class Chamomile extends Flower {

    public Chamomile(Color color, ComesFrom country, Smell smell, float price, int length) {
        super(color, country, smell, price, length);
    }

    public static Chamomile getRandomChamolite() {
        return new Chamomile(getRandomColor(), getRandomCountry(), getRandomSmell(), getRandomPrice(), getRandomLength());
    }

    @Override
    public String toString() {
        return "Chamomile: " +
                "color=" + color +
                ", country=" + country +
                ", smell=" + smell +
                ", price=" + Math.round(price) +
                ", length=" + length +
                ", spikes=No";
    }
}