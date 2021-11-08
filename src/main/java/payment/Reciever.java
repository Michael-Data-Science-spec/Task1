package payment;

public class Reciever implements User {
    public boolean status = false;
    public void update(boolean status) {
        this.status = status;
    }
}
