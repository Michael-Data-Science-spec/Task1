package payment;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    private Sender s;

    @org.junit.jupiter.api.BeforeEach
    void SetUp() {
        s = new Sender();
    }

    @org.junit.jupiter.api.Test
    void update() {
        assertEquals(s.status, false);
        s.update(true);
        assertEquals(s.status, true);
    }
}