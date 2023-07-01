package ushtrime_Word;

import java.util.Scanner;

public class Ushtrim19 {
    static void shumaSerise(int numri){
        double shuma = 0;
        for(int i=1;i<=numri;i++){
            shuma+=1.0/i;
        }
        System.out.println("Shuma e kesaj serie eshte: " + shuma);
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int nr= input.nextInt();
        shumaSerise(nr);
    }
}
