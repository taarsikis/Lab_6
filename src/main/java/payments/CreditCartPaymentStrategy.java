package payments;

public class CreditCartPaymentStrategy implements Payment{
    public String pay(double price){
        return "You paid " + price + " dollars by credit card.";
    }
}
