package db;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConnectionTest {
    private Connection c;

    @BeforeEach
    void setUp() {
        c = Connection.getConnection();
    }
    @Test
    void getConnection() {
        assertTrue(c instanceof Connection);
    }
}