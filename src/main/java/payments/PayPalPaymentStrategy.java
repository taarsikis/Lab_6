package payments;

public class PayPalPaymentStrategy implements Payment{
    public String pay(double price){
        return "You paid " + price + " dollars by PayPal.";
    }
}
