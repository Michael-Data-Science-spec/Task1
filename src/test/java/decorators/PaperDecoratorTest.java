package decorators;

import Flowers.Flower;
import Flowers.FlowerType;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {
    private PaperDecorator paperDecorator;
    private Flower flower;

    @org.junit.jupiter.api.BeforeEach
    void SetUp() {
        flower = new Flower(FlowerType.CHAMOMILE);
        paperDecorator = new PaperDecorator(flower);
    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(paperDecorator.getPrice(), 18.0);
    }

}