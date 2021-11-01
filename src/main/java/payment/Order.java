package payment;

import Flowers.FlowerBucket;
import Flowers.Item;
import decorators.PaperDecorator;
import delivery.Delivery;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter @Getter
public class Order {
    public List<Item> items = new ArrayList<>();
    public String deliveryAddress;
    public boolean fastDelivery;
    private Payment payment;
    private Delivery delivery;

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public double calculateTotalPrice() {
        double price = 0;
        for(Item i : this.items) {
            price += i.getPrice();
        }
        return price;
    }
}
