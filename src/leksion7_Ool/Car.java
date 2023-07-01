package leksion7_Ool;

public abstract class Car implements Vehicle{
    //klasat abstrakte thjesht i deklarojne metodat nuk i zhvillojme e njejta eshte edhe me interface
    private String type;
    private String color;
    //should always be override where is extended this class
    public Car(String type, String color){
        this.type=type;
        this.color=color;
    }
    public void changeColor(String color){
        this.color = color;
        System.out.printf("Car color changed to %\n", color);
    }
    //can be declared public, protected but not private
    protected abstract void runEngine();

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}
