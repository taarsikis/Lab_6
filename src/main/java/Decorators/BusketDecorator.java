package Decorators;

import DeliveryStrategies.Item;

public class BusketDecorator extends ItemDecorator{

    public BusketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice(){ return 4 + super.getPrice();}
}