package payment;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Payment {
    protected double balance;

    public void pay(double price) {
        this.balance -= price;
    }
}
