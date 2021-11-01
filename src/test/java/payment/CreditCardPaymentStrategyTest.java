package payment;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentStrategyTest {
    private CreditCardPaymentStrategy c;

    @org.junit.jupiter.api.BeforeEach
    void SetUp() {
        c = new CreditCardPaymentStrategy();
    }

    @org.junit.jupiter.api.Test
    void pay() {
        c.pay(10.0);
        assertEquals(c.getBalance(), 690.0);
    }
}