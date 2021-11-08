package payment;

public class Sender implements User {
    public boolean status = false;
    public void update(boolean status) {
        this.status = status;
    }
}
