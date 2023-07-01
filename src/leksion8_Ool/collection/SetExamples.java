package leksion8_Ool.collection;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetExamples {
    public static void main(String[] args) {
        System.out.println("------------------------- SETS ---------------------");
        //Vlerat jane unike dhe index vendoset ne baze te funksionit Hash te parashikuar nag sdk
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(5);
        set1.addAll(List.of(7, 12,1));
        set1.add(6);
        set1.addAll(List.of(56,43,20));
        set1.add(20);
        System.out.println("set1: " + set1);
        for (Integer e : set1){
            System.out.print(e + " ");
        }
        System.out.println();
        System.out.println("set1: " + set1);
        System.out.println("set1: " + set1.stream().sorted().toList()); //rradhite por nuk ndrshon setin.
        System.out.println(set1);
        System.out.println("Set1 ka gjithsej: " + set1.size() + " element.");
        System.out.println("Elementi i pare i Set1 eshte: " + set1.stream().findFirst());
        System.out.println("Ka vlere 12: " + set1.contains(12));
        System.out.println("Per te fshire numrin 12: " + set1.remove(12));
        System.out.println("Seti ka keto vlera: " + set1);
        //Rradhitja nuk ka rendesi kur behet krahasimi i dy seteve
        HashSet<Integer> set2 = new HashSet<>(List.of(43, 1, 3, 20, 5, 6, 7, 56));
        System.out.println("A eshte set1 == me set2: " + set1.equals(set2));
        TreeSet<Integer> treeSet = new TreeSet<>(List.of(2,4,1, 20, 50, 35, 61));
        treeSet.add(15);
        System.out.println("Tree set is: " + treeSet);
        //floor return the greater from those which are lower than or equal to than given value.
        System.out.println(treeSet.floor(40));
        //ceiling return the smallest from those which are greater than or equal to than given value.
        System.out.println(treeSet.ceiling(40));
    }
}
