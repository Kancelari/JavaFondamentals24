package leksion7_Ool;

public class BMW extends Car{
    public BMW(String type, String color) {
        super(type, color);
    }

    @Override
    public void changeColor(String color) {
        super.changeColor(color);
    }

    @Override
    protected void runEngine() {

    }

    @Override
    public String getFuelType() {
        return null;
    }
}
