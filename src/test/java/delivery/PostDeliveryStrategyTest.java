package delivery;

import Flowers.Item;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostDeliveryStrategyTest {
    private PostDeliveryStrategy post;
    List<Item> items = new ArrayList<>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        post = new PostDeliveryStrategy();
    }

    @org.junit.jupiter.api.Test
    void deliver() {
        post.deliver(items);
    }
}