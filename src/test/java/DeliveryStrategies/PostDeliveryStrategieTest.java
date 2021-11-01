package DeliveryStrategies;

import Flowers.Flower;
import Flowers.FlowerType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategieTest {
    private PostDeliveryStrategie PostDelivery;

    @BeforeEach
    void setUp() {
        PostDelivery = new PostDeliveryStrategie();
    }

    @Test
    void deliver() {
        List<Item> itemList = new ArrayList<>();
        Item flower = new Flower(FlowerType.ROSE);
        itemList.add(flower);
        assertEquals("You delivered all items by post!", PostDelivery.deliver(itemList));
    }
}