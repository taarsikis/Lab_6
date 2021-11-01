package DeliveryStrategies;

public abstract class Item {
    String description;
    double price;
    public String getDescription(){
        return this.description;
    }
    public double getPrice(){return this.price;};
    public void setPrice(double price){this.price = price;}
}
