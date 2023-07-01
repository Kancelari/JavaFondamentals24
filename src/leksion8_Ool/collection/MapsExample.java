package leksion8_Ool.collection;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapsExample {
    public static void main(String[] args) {
        HashMap<String, String> hashMap1 = new HashMap<>();
        //Jane nje koleksion te dhenash qe vlera mund te perseritet por celesi jo.
        hashMap1.put("Afrim", "Patalaku");
        hashMap1.put("Lorik", "Cana");
        hashMap1.put("Lorik", "Jera");
        hashMap1.put("Agim", "Jera");
        System.out.println(hashMap1);
        System.out.println("Madhesia e hashmap1 eshte: " + hashMap1.size());
        System.out.println("A kemi vlera ne hashmap1: " + hashMap1.isEmpty());
        System.out.println("Vlera e key: Lorik eshte: " + hashMap1.get("Lorik"));
        System.out.println(hashMap1.remove("Agim"));
        System.out.println(hashMap1);
        for(String k : hashMap1.keySet()){
            System.out.print(k + " ");
        }
        System.out.println();
        for (String k : hashMap1.values()){
            System.out.print(k + " ");
        }
        System.out.println();
        for (Map.Entry<String, String> entry : hashMap1.entrySet()){
            System.out.printf("Key: %s, Value: %s \n", entry.getKey(), entry.getValue());
        }
        for(String k : hashMap1.keySet()){
            System.out.printf("Key: %s, Value: %s \n", k, hashMap1.get(k));
        }
        LinkedHashMap<String, String> map2 =new LinkedHashMap<>();
        map2.put("Emri", "Afrim");
        map2.put("Mbiemri", "Patalaku");
        map2.put("Arsimi", "Larte");
        System.out.println("Shfaqja e elementeve te LinkedHashMap");
        for (String key: map2.keySet()){
            System.out.printf("Key is: %s, Value is %s\n", key, map2.get(key));
        }
        System.out.println("Madhesia e listes LinkedHashMap eshte: " + map2.size());
        System.out.println(map2);
        System.out.println(map2.remove("Arsimi"));
        System.out.println(map2);
    }
}
