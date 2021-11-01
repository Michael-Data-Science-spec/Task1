package Flowers;

import java.util.ArrayList;
import java.util.List;

public class Store {
    public List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public int search(FlowerType flowerType) {
        int flowersPresent = 0;
        for (FlowerBucket flowerBucket : flowerBuckets) {

            for (int i = 0; i < flowerBucket.flowerPacks.size(); i++) {

//                if (flowerBucket.flowerPacks.get(i).getFlower().getFlowerType() == flowerType) {
//                    flowersPresent += 1;
//                }
            }
        }
        return flowersPresent;
    }
}