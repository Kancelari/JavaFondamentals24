package ushtrime_Word;

import java.util.Scanner;

public class Ushtrim16 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String teksti=input.nextLine();
        int max=0;
        char shkronja=' ';
        for(int i=0;i<teksti.length();i++){
            char x=teksti.charAt(i);
            int perserite=0;
            for (int j=0;j<teksti.length();j++) {
                if (x == teksti.charAt(j)) {
                    perserite = perserite+1;
                    //shkronja=x;
                }
            }
            if(perserite>max){
                max=perserite;
                shkronja=x;
            }
        }
        System.out.println("Karakteri që përsëritet më shumë është [" +shkronja+"] kjo shkronje perseritet: " + max);
    }
}
