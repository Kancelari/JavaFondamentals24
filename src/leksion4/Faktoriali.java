package leksion4;

import java.util.Scanner;

public class Faktoriali {
    public static int faktorial(int x){
        if(x==1){
            return 1;
        }
        else{
            return x*faktorial(x-1);
        }
    }
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int nr= input.nextInt();
        int shuma=faktorial(nr);
        System.out.println(shuma);
    }
}
