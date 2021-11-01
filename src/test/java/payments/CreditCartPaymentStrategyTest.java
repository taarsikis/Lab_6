package payments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCartPaymentStrategyTest {
    private CreditCartPaymentStrategy card;

    @BeforeEach
    void setUp() {
        card = new CreditCartPaymentStrategy();
    }

    @Test
    void pay() {
        assertEquals("You paid 10.5 dollars by credit card.", card.pay(10.5));
    }
}