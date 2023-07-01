package ushtrime_Word;

import java.util.Scanner;

public class Ushtrim9 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num= input.nextInt();
        for (int i=0; i<=num; i++){
            System.out.println(num + " X " + i + " = "+(num*i));
        }
    }
}
