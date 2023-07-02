package leksion9_Generics;
//Adding generics into class with constraint that is extendes Liquid (Every class that is
//subclass of specified interface or class or abstract class)
public class Cup <T extends Liquid> {

    private T liquid;
    private Portion portion;

    public Cup(T liquid, Portion portion) {
        this.liquid = liquid;
        this.portion = portion;
    }

    public T getLiquid() {
        return liquid;
    }

    public void setLiquid(T liquid) {
        this.liquid = liquid;
    }

    public Portion getPortion() {
        return portion;
    }

    public void setPortion(Portion portion) {
        this.portion = portion;
    }
    public void drink(){
        System.out.println("Drinking " + liquid + " and we are drinking in a " + portion + " cup.");
    }

    @Override
    public String toString() {
        return "" + liquid +
                ", and the portion is " + portion;
    }
}
