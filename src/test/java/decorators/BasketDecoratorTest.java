package decorators;

import Flowers.Flower;
import Flowers.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class BasketDecoratorTest {
    private BasketDecorator basketDecorator;
    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void SetUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        basketDecorator = new BasketDecorator(flower);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(basketDecorator.getPrice(), 9.0);
    }
}