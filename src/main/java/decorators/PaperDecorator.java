package decorators;

import Flowers.Item;

public class PaperDecorator extends ItemDecorator {

    public PaperDecorator(Item item) {
        super(item);
    }

    public double getPrice(){
        return this.item.getPrice() + 13;
    }
}
