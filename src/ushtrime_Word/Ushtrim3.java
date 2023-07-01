package ushtrime_Word;

import java.util.Scanner;

public class Ushtrim3 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number");
        int nr=input.nextInt();
        System.out.println(nr + " + " + ((nr*10)+nr) +" + " + ((nr*100)+(nr*10)+nr));
    }
}
