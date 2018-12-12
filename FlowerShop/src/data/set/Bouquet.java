package data.set;

import data.base.Color;
import data.base.ComesFrom;
import data.base.Smell;
import data.flower.Chamomile;
import data.flower.Flower;
import data.flower.Rose;
import data.flower.Tulip;

import java.util.LinkedList;
import java.util.List;

public class Bouquet extends FlowerList {

    public Bouquet() {
        super();
    }

    public Bouquet(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    public static float suma = 0;

    public static Bouquet getRandomBouquet() {
        int count = (random.nextInt(2) + 1) * 10 + 1;

        List<Flower> flowers = new LinkedList<>();
        for(int i = 0; i < count; i++) {
            int flowerType = random.nextInt(3);
            Color color = Flower.getRandomColor();
            Smell smell = Flower.getRandomSmell();
            ComesFrom country = Flower.getRandomCountry();
            int length = Flower.getRandomLength();
            float price = Flower.getRandomPrice();

            switch (flowerType) {
                case 0: flowers.add(new Rose(color, country, smell, price, length)); break;
                case 1: flowers.add(new Chamomile(color, country, smell, price, length)); break;
                case 2: flowers.add(new Tulip(color, country, smell, price, length)); break;
            }
            suma += price;
        }

        return new Bouquet(flowers);
    }

    @Override
    public String toString() {
        return "Bouquet: " +
                "flowers=" + flowers +
                "\nAmount: " + getCount() +
                "\nPrice: " + Math.round(suma);
    }
}
