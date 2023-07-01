package ushtrime_Loops;

import java.util.Calendar;
import java.util.Scanner;

public class Kalendari {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Calendar c=Calendar.getInstance();
        //int dita=20;
        System.out.print("Ne cilen dite fillon muaji (Jepni nje numer): ");
        int ditajaves=sc.nextInt();
        System.out.print("Sa dite ka muaji: ");
        int dite=sc.nextInt();
        int dita=c.get(Calendar.DAY_OF_MONTH);
        System.out.println("Mo\tTu\tWe\tTh\tFr\tSa\tSu");
        System.out.println("\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\-\\");
        for (int j=1; j<ditajaves;j++){
            System.out.print("\t");
        }
            for (int i = 1; i <= dite; i++) {
                if ((i+ditajaves-1) % 7 == 0) {
                    if (i == dita) {
                        System.out.print("[" + i + "]");
                        System.out.println();
                    } else {
                        System.out.print(i);
                        System.out.println();
                    }
                } else {
                    if (i == dita) {
                        System.out.print("[" + i + "]"+ "\t");
                    } else {
                        System.out.print(i + "\t");
                    }
                }
            }
        }
}
