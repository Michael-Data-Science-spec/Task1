package payment;

import lombok.Getter;

@Getter
public class CreditCardPaymentStrategy extends Payment{
    private double balance = 700.0;

    @Override
    public void pay(double price) {
        this.balance -= price;
        System.out.printf("Paid by credit card");
    }
}
