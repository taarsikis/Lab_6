import DeliveryStrategies.Item;
import Decorators.ItemInterface;
import Flowers.Flower;
import lombok.Setter;

@Setter
public class FlowerPack extends Item implements ItemInterface {
    private Flower flower;
    private int amount;

    public double getPrice(){
        return this.amount * this.flower.getPrice();
    }

    @Override
    public String toString() {
        return  "(" +
                flower +
                ", amount=" + amount +
                ')';
    }
}
