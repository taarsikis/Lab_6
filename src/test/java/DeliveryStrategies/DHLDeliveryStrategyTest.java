package DeliveryStrategies;

import Flowers.Flower;
import Flowers.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DHLDeliveryStrategyTest {
    private DHLDeliveryStrategy DHLDelivery;

    @BeforeEach
    void setUp() {
        DHLDelivery = new DHLDeliveryStrategy();
    }

    @Test
    void deliver() {
        List<Item> itemList = new ArrayList<>();
        Item flower = new Flower(FlowerType.ROSE);
        itemList.add(flower);
        assertEquals("You delivered all items by DHL!", DHLDelivery.deliver(itemList));
    }
}