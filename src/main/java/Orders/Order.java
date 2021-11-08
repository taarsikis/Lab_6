package Orders;

import DeliveryStrategies.Item;
import Flowers.Flower;
import Flowers.FlowerType;
import Users.User;


import java.util.LinkedList;

public class Order {
    LinkedList<User> users = new LinkedList<>();
    LinkedList<Item> items = new LinkedList<>();

    private String status;

    public void Order(LinkedList<User> users, String status){
        this.users = users;
        this.status = status;
        this.items = items;
    }

    public void Order(){}


    public String processOrder() {
        return "Your Order is being processed.";
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(Item user) {
        users.remove(user);
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void notifyUsers(String status){
        for (int i = 0; i < users.size(); i++){
            users.get(i).update(status);
        }
    }
    public void order(){
        this.notifyUsers(this.status);
    }

    public static Order QuickOrder(){
        Order order = new Order();
        Item flower = new Flower(FlowerType.ROSE);
        order.addItem(flower);
        return order;
    }

}