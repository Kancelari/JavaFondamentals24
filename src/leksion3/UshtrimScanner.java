package leksion3;

import java.util.Scanner;

public class UshtrimScanner {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int x;
        System.out.print("Ju lutem vendosni nje numer: ");

        x=scan.nextInt();
        System.out.println("Numri qe vendoset eshte " + x);
        if(x>0){
            System.out.println("Numri qe vendoset eshte pozitiv");
        }
        else {
            System.out.println("Numri qe vendoset eshte negativ");
        }
        Scanner sc=new Scanner(System.in);
        System.out.print("Jepni emrin tuaj: ");
        String emri=sc.nextLine();
        System.out.println(emri.length());

    }
}
