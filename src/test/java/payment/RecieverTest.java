package payment;

import javax.sound.midi.Receiver;

import static org.junit.jupiter.api.Assertions.*;

class RecieverTest {
    private Reciever r;

    @org.junit.jupiter.api.BeforeEach
    void SetUp() {
        r = new Reciever();
    }

    @org.junit.jupiter.api.Test
    void update() {
        assertEquals(r.status, false);
        r.update(true);
        assertEquals(r.status, true);
    }
}