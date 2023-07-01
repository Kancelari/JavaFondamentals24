package ushtrime_Word;

import java.util.Scanner;

public class Ushtrim10 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int x= input.nextInt();
        x=x*2;
        int shuma=0;
        for (int i=1;i<=x;i=i+2){
            shuma=shuma+i;
            System.out.println(i);
        }
        System.out.println("Shuma e ketyre numrave eshte: " + shuma);
    }
}
