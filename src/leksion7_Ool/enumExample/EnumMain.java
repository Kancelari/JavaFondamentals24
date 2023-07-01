package leksion7_Ool.enumExample;
public class EnumMain {
    public static void main(String[] args) {
        //enum eshte nje strukture e tipit te paracaktuar me nje vlere
        //enum ka property default si name(), ordinal(), equals()
        Coffee enum1= Coffee.LATTE;
        System.out.println("Enum1: "+ enum1);
        System.out.println("Enum1: "+ enum1.name());
        //ordinal kthen indeksin ne baze te rradhitjes qe kemi bere ne
        System.out.println("Enum1: "+ enum1.ordinal());
        Coffee enum2= Coffee.ESPRESSO;
        System.out.println("Enum2: "+ enum2);
        System.out.println("Enum2: "+ enum2.name());
        System.out.println("Enum2 ordinal: "+ enum2.ordinal());
        System.out.println("Enum2 value: "+ enum2.getValue());
        Laptops l1=Laptops.HP;
        System.out.println("Laptopi i pare i blere: "+ l1.name());
        System.out.println("Laptopi " + l1 + " ka keto parametra " + l1.getDesc() +" i gjenerates "+l1.getGen());
    }
}
