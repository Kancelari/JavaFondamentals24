package leksion9_Generics;
public class Tea implements Liquid{
    public enum teaType{
        BORONIC,
        LEMON,
        KAMOMIL
    }
    private teaType type;
    private double price;
    public void setPrice(double price) {
        this.price = price;
    }
    public teaType getType() {
        return type;
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return type +" tea and the price is " + price + "$";
    }

    public Tea(double price, teaType type) {
        this.price = price;
        this.type = type;
    }
    public Tea() {
    }

}
