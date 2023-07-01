package ushtrime_Word;

import java.util.Scanner;

public class Ushtrim15 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int[] num=new int[6];
        boolean ok=false;
        for (int i=0;i<num.length;i++){
            num[i]=input.nextInt();
        }
        int kerko=input.nextInt();
        for(int j=0;j<num.length;j++){
            if(kerko==num[j]){
                ok=true;
            }
        }
        System.out.println("Vlera e kerkuar: " + ok);
    }
}
