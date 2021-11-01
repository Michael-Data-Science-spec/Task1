package decorators;

import Flowers.Item;

public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice(){
        return this.item.getPrice() + 4;
    }
}
