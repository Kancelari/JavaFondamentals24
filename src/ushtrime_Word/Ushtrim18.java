package ushtrime_Word;

import java.util.Scanner;

public class Ushtrim18 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String tekst=input.nextLine();
        for(int i=0;i<tekst.length();i++){
            System.out.print(tekst.charAt(i)+""+tekst.charAt(i));
        }
    }

}
