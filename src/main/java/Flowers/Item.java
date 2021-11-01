package Flowers;

public abstract class Item {
    protected String description;

    public abstract double getPrice();

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String descrtiption) {
        this.description = descrtiption;
    }
}
