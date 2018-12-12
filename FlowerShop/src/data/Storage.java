package data;

import data.set.Basket;
import data.set.Bouquet;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Storage {
    List<Basket> baskets;
    List<Bouquet> bouquets;

    public Storage() {
        baskets = new LinkedList<>();
        bouquets = new LinkedList<>();
    }

    public void addRandomData() {
        Random random = new Random();
        int basketsCount = random.nextInt(4) + 1;
        int bouquetsCount = random.nextInt(3) + 2;
        for (int i = 0; i < basketsCount; i++) {
            baskets.add(Basket.getBasket(random.nextInt(50), random.nextInt(3)));
        }
        for (int i = 0; i < bouquetsCount; i++) {
            bouquets.add(Bouquet.getRandomBouquet());
        }
    }


    @Override
    public String toString() {
        return "Storage: " +
                "baskets=" + baskets +
                ", bouquets=" + bouquets;
    }
}
