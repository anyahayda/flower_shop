package data.flower;

import data.base.Color;
import data.base.ComesFrom;
import data.base.Smell;

import java.util.Random;


public abstract class Flower {
    protected Color color;
    protected ComesFrom country;
    protected Smell smell;
    protected float price;
    protected int length;

    protected static Random random = new Random();

    public Flower(Color color, ComesFrom country, Smell smell, float price, int length) {
        this.color = color;
        this.country = country;
        this.smell = smell;
        this.price = price;
        this.length = length;
    }

    public Color getColor() {
        return color;
    }

    public ComesFrom getCountry() {
        return country;
    }

    public float getPrice() {
        return price;
    }

    public int getLength() {
        return length;
    }

    public static Color getRandomColor() {
        switch (random.nextInt(3)) {
            case 0:
                return Color.RED;
            case 1:
                return Color.GREEN;
            case 2:
                return Color.BLUE;
        }
        return Color.RED;
    }

    public static ComesFrom getRandomCountry() {
        switch (random.nextInt(3)) {
            case 0:
                return ComesFrom.UKRAINE;
            case 1:
                return ComesFrom.USA;
            case 2:
                return ComesFrom.AUSTRIA;
        }
        return ComesFrom.UKRAINE;
    }

    public static Smell getRandomSmell() {
        switch (random.nextInt(3)) {
            case 0:
                return Smell.AMAZING;
            case 1:
                return Smell.WITHOUT;
            case 2:
                return Smell.GREAT;
        }
        return Smell.AMAZING;
    }

    public static float getRandomPrice() {
        return 3 + random.nextFloat() * 10;
    }

    public static int getRandomLength() {
        return (4 + random.nextInt(5)) * 10;
    }


}
