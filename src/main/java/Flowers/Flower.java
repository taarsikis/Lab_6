package Flowers;
import DeliveryStrategies.Item;
import Decorators.ItemInterface;
import lombok.*;

import java.util.Arrays;

@Getter @Setter
public class Flower extends Item implements ItemInterface {
    private double sepalLength;
    private int[] color;
    private double price;
    private FlowerType flowerType;

    public void setColor(int[] color) {
        this.color = Arrays.copyOf(color, color.length);
    }

    public Flower(FlowerType flowerType){
        this.flowerType = flowerType;
    }

    public String toString() {
        return flowerType +
                ", color=" + Arrays.toString(color) +
                ", price=" + price;
    }
}
