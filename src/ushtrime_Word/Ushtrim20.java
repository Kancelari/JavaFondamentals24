package ushtrime_Word;

import java.util.Scanner;

public class Ushtrim20 {
    static void nrString (String stringa){
        System.out.println(stringa.length());
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String tekst= input.nextLine();
        nrString(tekst);
    }
}
