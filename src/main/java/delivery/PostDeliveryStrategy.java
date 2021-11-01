package delivery;

import Flowers.Item;

import java.util.List;

public class PostDeliveryStrategy implements Delivery {

    @Override
    public void deliver(List<Item> items) {
        System.out.printf("The items will be delivered by post");
    }
}
