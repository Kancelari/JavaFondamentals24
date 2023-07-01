package ushtrime_Word;

import java.util.Scanner;

public class Ushtrim1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Width = ");
        double  x=sc.nextDouble();
        System.out.print("height = ");
        double  y=sc.nextDouble();
        double  area=x*y;
        double perimeter=2*(x+y);
        System.out.println("Area is "+ x + "*" + y + "=" + area);
        System.out.println("Perimeter is 2 * ("+ x + "+" + y + ")=" + perimeter);


    }
}
