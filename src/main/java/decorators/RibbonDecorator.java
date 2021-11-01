package decorators;

import Flowers.Item;

public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public double getPrice(){
        return this.item.getPrice() + 40;
    }
}
