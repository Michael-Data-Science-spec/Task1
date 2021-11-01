package Flowers;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack(Flower flower, int amount) {
        setFlower(flower);
        setAmount(amount);
    }

    public double getPrice() {
        return this.amount * this.flower.getPrice();
    }
    public Flower getFlower() throws Exception {
        if (getAmount() < 1) {
            throw new IndexOutOfBoundsException("Flower pack is empty");
        }

        this.amount = 0;

        return flower;
    }

    public boolean hasFlower() {
        return amount >= 1;
    }
}