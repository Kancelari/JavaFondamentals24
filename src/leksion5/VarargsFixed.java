package leksion5;

import java.util.Scanner;

public class VarargsFixed {
    public static void mixedArg(String text, int... nr){
        System.out.println("Po afishoj te dhenat e " + text);
        for (int i=0;i<nr.length;i++){
            System.out.print(nr[i] + ", \t");
        }
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String modul;
        int nrOreLeksion, nrOreUshtrime, nrOreTest;
        System.out.println("Me percakto modulin: ");
        modul=input.nextLine();
        System.out.println("Me percakto oret e leksioneve: ");
        nrOreLeksion=input.nextInt();
        System.out.println("Me percakto oret e ushtrimeve: ");
        nrOreUshtrime=input.nextInt();
        System.out.println("Me percakto oret e testit: ");
        nrOreTest=input.nextInt();
        mixedArg(modul, nrOreLeksion, nrOreUshtrime, nrOreTest);
    }
}
