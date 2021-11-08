package Orders;

import DeliveryStrategies.Item;
import Users.User;


import java.util.LinkedList;

public class Order {
    LinkedList<User> users = new LinkedList<>();
    private String status;

    public void Order(LinkedList<User> users, String status){
        this.users = users;
        this.status = status;
    }

    public void Order(){}


    public String processOrder() {
        return "Your Order is being processed.";
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeItem(Item user) {
        users.remove(user);
    }

    public void notifyUsers(String status){
        for (int i = 0; i < users.size(); i++){
            users.get(i).update(status);
        }
    }
    public void order(){
        this.notifyUsers(this.status);
    }

}