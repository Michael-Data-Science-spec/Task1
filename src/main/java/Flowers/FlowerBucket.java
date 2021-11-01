package Flowers;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    public List<FlowerPack> flowerPacks = new ArrayList<FlowerPack>();

    public double getPrice() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            price += flowerPacks.get(i).getPrice();
        }
        return price;
    }

    public FlowerBucket() {
        for (FlowerType flowerType : FlowerType.values()) {
            Flower flower = new Flower(flowerType);
            flower.setPrice(5.0);
            this.addFlowerPack(new FlowerPack(flower, 3));
        }
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

}