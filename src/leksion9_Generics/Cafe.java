package leksion9_Generics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Cafe {
    private static  <T extends Liquid>Cup<T>getMostExpensiveCup(List<Cup<T>> cups){
        Cup<T> mostExpensiveCup =cups.get(0);
        for (Cup c : cups){
            if(c.getLiquid().getPrice()>mostExpensiveCup.getLiquid().getPrice()){
                mostExpensiveCup=c;
            }
        }
        return mostExpensiveCup;
    }
    public static void main(String[] args) {
        Liquid l1 = new Tea(60.0, Tea.teaType.KAMOMIL);
        Tea tea1 = new Tea(20.5d, Tea.teaType.BORONIC);
        Cup cup1 = new Cup<>(tea1,Portion.BIG);
        cup1.drink();
        Cup cup2 = new Cup<Tea>(tea1, Portion.MEDIUM);
        cup2.drink();
        Util<String, String> util = new Util<String, String>() {
            @Override
            public String getValue(Map<String, String> map, String key) {
                return map.get(key);
            }
        };
        Map<String, String>map1=new HashMap<>(Map.
                of("name", "Afrim",
                        "surname", "Patalaku"));
        System.out.println("Name " + util.getValue(map1, "name"));
        System.out.println("Surname " + util.getValue(map1, "surname"));
        System.out.println("==============================================");
        Cup<Liquid> cup3= new Cup<>((new Tea(90.5, Tea.teaType.KAMOMIL)), Portion.BIG);
        Cup<Liquid> cup4= new Cup<>((new Tea(50.0, Tea.teaType.LEMON)), Portion.MEDIUM);
        Cup<Liquid> cup5= new Cup<>((new Tea(110.0, Tea.teaType.BORONIC)), Portion.SMALL);
        Cup<Liquid> cup6= new Cup<>((new Coffee(Coffee.coffeeType.CAPUCHINO, 100.0)), Portion.SMALL);
        List<Cup<Liquid>> cups = new ArrayList<>(List.of(cup3, cup4, cup5, cup6));
        System.out.println("Most expensive drink is " + getMostExpensiveCup(cups));
    }
}
