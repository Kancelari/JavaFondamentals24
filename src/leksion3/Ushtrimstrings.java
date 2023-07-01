package leksion3;

public class Ushtrimstrings {
    public static void main(String[]args){
        //Deklarojme dy ndryshore te tipit string
        String ndryshore1="Sda Protik";
        String ndryshore2="Java Fnd";
        //Krahasojme vlerat e dy stringave
        System.out.println("A jane te barabarta stringat ? "+ndryshore1.equals(ndryshore2));
        System.out.println(ndryshore1.toUpperCase());
        System.out.println(ndryshore1);
        System.out.println(ndryshore2.toLowerCase());
        System.out.println(ndryshore2);
        System.out.println("Numri i karaktereve te ndryshores se pare = "+ndryshore1.length());
        System.out.println(ndryshore2.intern());
        ndryshore2="Java Fund";
        System.out.println(ndryshore2);
        System.out.println(ndryshore1+" "+ndryshore2);
        System.out.println(ndryshore2.indexOf("un"));
        System.out.println(ndryshore2.replaceAll("a","o"));
        System.out.printf("100.0 / 3.0 = %5.2f", 100.0 / 3.0);
        System.out.println();
        System.out.printf("100 / 3 = %4d", 100 / 3);

    }
}
