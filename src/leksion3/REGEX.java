package leksion3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REGEX {
    public static void main(String[]args){
        String textngaperdoruesi;
        Scanner scan=new Scanner(System.in);
        System.out.println("Ju lutem vendosni nje text");
        textngaperdoruesi=scan.nextLine();
        System.out.println("Teksti qe keni vendosur eshte: "+textngaperdoruesi);
        Pattern forma_tekstit=Pattern.compile("a+bcd");
        Matcher ok= forma_tekstit.matcher(textngaperdoruesi);
        System.out.println(ok.matches());
        System.out.println(ok.find());





    }
}
