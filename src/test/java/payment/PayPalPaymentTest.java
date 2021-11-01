package payment;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentTest {
    private PayPalPayment c;

    @org.junit.jupiter.api.BeforeEach
    void SetUp() {
        c = new PayPalPayment();
    }

    @org.junit.jupiter.api.Test
    void pay() {
        c.pay(12.0);
        assertEquals(c.getBalance(), 288.0);
    }

}