package payments;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentStrategyTest {
    private PayPalPaymentStrategy card;

    @BeforeEach
    void setUp() {
        card = new PayPalPaymentStrategy();
    }

    @Test
    void pay() {
        assertEquals("You paid 10.5 dollars by PayPal.", card.pay(10.5));
    }
}