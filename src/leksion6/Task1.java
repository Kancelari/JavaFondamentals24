package leksion6;


import java.util.Scanner;

public class Task1 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        float diameter= input.nextFloat();
        System.out.println("Perimetri i ketij rrethi eshte: " + (diameter/2.0)*2.0*3.14);
        System.out.println("Perimetri i ketij rrethi me PI nga metoda eshte: " + (diameter/2.0)*2.0*Math.PI);
    }
}
