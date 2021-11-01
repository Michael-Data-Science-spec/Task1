package delivery;

import Flowers.Flower;
import Flowers.FlowerType;
import Flowers.Item;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    private DHLDeliveryStrategy dhl;
    List<Item> items = new ArrayList<>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dhl = new DHLDeliveryStrategy();
    }

    @org.junit.jupiter.api.Test
    void deliver() {
        dhl.deliver(items);
    }
}