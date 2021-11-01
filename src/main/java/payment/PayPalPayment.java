package payment;

import lombok.Getter;

@Getter
public class PayPalPayment extends Payment {
    private double balance = 300.0;

    @Override
    public void pay(double price) {
        this.balance -= price;
        System.out.printf("Paid using pay pal");
    }
}
