package Decorators;

import DeliveryStrategies.Item;

public class RibbonDecorator extends ItemDecorator{

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice(){ return 40 + super.getPrice();}
}