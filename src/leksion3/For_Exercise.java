package leksion3;

import java.util.Scanner;

public class For_Exercise {
    public static void main (String[]args){
        Scanner scan=new Scanner(System.in);
        int nr;
        System.out.println("Te lutem vendos nje numer pozitiv: ");
        for(int i=1; i<=10;i++){
            nr=scan.nextInt();
            if(nr>=0) {
                if (i < 5) {
                    System.out.println("Vendos nje numer tjeter: ");
                }
            }
            else{
                System.out.println("Ju vendoset nje numer negativ");
                break;
            }
        }
    }
}
