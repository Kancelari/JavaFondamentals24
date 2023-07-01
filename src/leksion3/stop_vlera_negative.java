package leksion3;

import java.util.Scanner;

public class stop_vlera_negative {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int nr;
        do{
            System.out.print("Jepni nje numer: ");
            nr=scan.nextInt();
            System.out.println("Numri qe vendoset eshte "+ nr);
        }
        while(nr>=0);
    }
}
