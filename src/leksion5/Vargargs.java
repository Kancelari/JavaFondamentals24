package leksion5;

import java.util.Scanner;


public class Vargargs {
    static void afishoNr(int...nr){
        for (int i=0;i<nr.length; i++){
            System.out.println(nr[i]);
        }
    }
    static void afishoKaraktere(char...ch){
        for (int i=0;i<ch.length; i++){
            System.out.print(ch[i]);
        }
    }
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int x,a,c;
        System.out.println("Vendos nje vlere: ");
        x=input.nextInt();
        System.out.println("Vendos nje vlere tjeter: ");
        a=input.nextInt();
        System.out.println("Vendos vleren e fundit: ");
        c=input.nextInt();
        afishoNr(a,c,x);
        System.out.println("Vendos nje shkronje: ");
        char ch=input.next().charAt(0);
        char ch1=input.next().charAt(0);
        char ch2=input.next().charAt(0);
        afishoKaraktere(ch,ch1,ch2);
    }
}
