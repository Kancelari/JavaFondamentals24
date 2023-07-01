package ushtrime_Word;

import java.util.Scanner;

public class Ushtrim8 {
    public static void main(String[]args){
        int [] nr=new int[4];
        boolean vertet=false;
        Scanner input=new Scanner(System.in);
        for (int i=0;i<nr.length;i++){
            nr[i]=input.nextInt();
        }
        for (int j=0;j<nr.length;j++){
            if(nr[j]==4 || nr[j]==7){
                vertet=true;
            }
        }
        System.out.println(vertet);
    }
}
