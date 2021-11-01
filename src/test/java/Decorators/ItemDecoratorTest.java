package Decorators;

import DeliveryStrategies.Item;
import Flowers.Flower;
import Flowers.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemDecoratorTest {
    Item flower;

    @BeforeEach
    void setUp() {
        flower = new Flower(FlowerType.ROSE);
        flower.setPrice(10);

        flower = new BusketDecorator(flower);

    }

    @Test
    void getPrice() {
        assertEquals(14, flower.getPrice());
        flower = new RibbonDecorator(flower);
        assertEquals(54, flower.getPrice());
        flower = new PaperDecorator(flower);
        assertEquals(67, flower.getPrice());
    }

}