package leksion6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Jepni numrin e pare: ");
        int a= input.nextInt();
        System.out.print("Jepni numrin e dyte: ");
        int b= input.nextInt();
        System.out.print("Jepni numrin e trete: ");
        int c= input.nextInt();
        double x1=0;
        double x2=0;
        double delta=(b*b)-(4*a*c);
        if(delta<0){
            System.out.println("Delta negative");
        }
        else if(delta==0){
            delta=(double)-b/(2*a);
            System.out.println(delta);
        }
        else {
            x1 = ((-b)-Math.sqrt(delta))/(2*a);
            x2 = ((-b)+Math.sqrt(delta))/(2*a);
            System.out.println("Vlera e x1 eshte: " + x1);
            System.out.println("Vlera e x2 eshte: " + x2);
        }
    }
}
