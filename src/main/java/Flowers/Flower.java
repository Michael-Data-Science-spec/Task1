package Flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@Setter
@ToString
public class Flower extends Item {
    private double price;
    private double sepalLength;
    private int [] color;
    private FlowerType flowerType;

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
        this.price = 5.0;
    }

    public String getDescription() {
        return String.format("Flower{price: %f, sepal length: %f, flower type: %s}",
                this.price, this.sepalLength, this.flowerType);
    }

    public double getPrice() {
        return this.price;
    }

}