package DeliveryStrategies;

import java.util.ArrayList;
import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public String deliver(List<Item> items){
        return "You delivered all items by DHL!";
    }
}
