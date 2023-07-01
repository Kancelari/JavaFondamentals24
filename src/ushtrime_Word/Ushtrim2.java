package ushtrime_Word;

import java.util.Scanner;

public class Ushtrim2 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input first integer: ");
        int nr1= sc.nextInt();
        System.out.print("Input second integer: ");
        int nr2=sc.nextInt();

        if(nr1>nr2){
            System.out.println(nr1+ " > "+nr2);
        }
        else if(nr1<nr2){
            System.out.println(nr2 + " > " + nr1);
        }
        else if (nr1==nr2){
            System.out.println(nr1 + " == " + nr2);
        }
        else {
            System.out.println(nr1+ " != "+nr2);
        }
    }
}
