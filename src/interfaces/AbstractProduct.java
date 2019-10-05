package interfaces;

public abstract class AbstractProduct {
    private double price;

    public abstract void open();

    public double getPrice() {
        return price;
    }

    public void setPrice(double p) {
        price = p;
    }
}
