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

/*
Store same flowers
 */
public class Basket extends FlowerList {

    public Basket() {
        super();
    }

    public Basket(List<Flower> initialFlowers) {
        super(initialFlowers);
    }

    public static float suma = 0;

    public static Basket getBasket(int count, int flowerType) {
        Color color = Flower.getRandomColor();
        ComesFrom country = Flower.getRandomCountry();
        Smell smell = Flower.getRandomSmell();
        int length = Flower.getRandomLength();
        float price = Flower.getRandomPrice();

        List<Flower> flowers = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            switch (flowerType) {
                case 0: flowers.add(new Rose(color, country, smell, price, length)); break;
                case 1: flowers.add(new Chamomile(color, country, smell, price, length));break;
                case 2: flowers.add(new Tulip(color, country, smell, price, length)); break;
            }
            suma += price;
        }

        return new Basket(flowers);
    }


    @Override
    public String toString() {
        return "\nBasket: " +
                "flowers=" + flowers +
                "\nAmount: " + getCount() +
                "\nPrice: " + Math.round(suma);
    }
}
