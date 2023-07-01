package leksion6;

import java.util.Scanner;

public class Task14 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        char x=input.next().charAt(0);
        char y=input.next().charAt(0);
        int nr1=x;
        int nr2=y;
        int dif=nr1-nr2;
        if(dif<0){
            dif=dif*-1;
        }
        System.out.println("Ndermjet ketyre dy shkonjave kemi "+ (dif-1)+" shkronja te tjera");
    }
}
