package leksion9_Generics;

public class Coffee implements Liquid{
    public enum coffeeType{
        CAFFE,
        MACCHIATO,
        CAPUCHINO
    }

    public Coffee(coffeeType type, double price) {
        this.type = type;
        this.price = price;
    }
    @Override
    public String toString() {
        return type +" caffe and the price is " + price + "$";
    }

    public coffeeType getType() {
        return type;
    }

    public void setType(coffeeType type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private coffeeType type;
    private double price;
    @Override
    public double getPrice() {
        return price;
    }
}
