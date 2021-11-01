package decorators;

import Flowers.Flower;
import Flowers.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class RibbonDecoratorTest {
    private RibbonDecorator ribbonDecorator;
    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void SetUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        ribbonDecorator = new RibbonDecorator(flower);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(ribbonDecorator.getPrice(), 45.0);
    }

}