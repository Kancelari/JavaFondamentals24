package ushtrime_Word;

import java.util.Scanner;

public class Ushtrim17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tekst = input.nextLine();
        for (int i = tekst.length()-1; i >=0; i--) {
            System.out.print(tekst.charAt(i));
        }
    }
}
