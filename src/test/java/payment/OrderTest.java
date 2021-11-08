package payment;

import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    private Order o;
    private User u;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        o = new Order();
        u = new Sender();
    }

    @org.junit.jupiter.api.Test
    void addUser() {
        o.addUser(u);
        assertEquals(o.users.get(0), u);
    }

    @org.junit.jupiter.api.Test
    void removeUser() {
        o.addUser(u);
        o.removeUser(u);
        assertEquals(o.users.isEmpty(), true);
    }
}