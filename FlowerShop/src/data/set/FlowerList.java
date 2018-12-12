package data.set;

import data.flower.Flower;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public abstract class FlowerList {

    protected List<Flower> flowers;
    protected static Random random = new Random();

    public FlowerList() {
        flowers = new LinkedList<>();
    }

    public FlowerList(List<Flower> initialFlowers) {
        flowers = new LinkedList<>();
        flowers.addAll(initialFlowers);
    }


    private void addFlower(Flower flower) {
        flowers.add(flower);
    }

    protected List<Flower> getFlowers() {
        return flowers;
    }

    protected int getCount() {
        return flowers.size();
    }

    protected float getOveralPrice() {
        float sum = 0;
        for (Flower flower : flowers) {
            sum += flower.getPrice();
        }

        return sum;
    }
}
