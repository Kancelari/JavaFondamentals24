package leksion6;
import java.util.Scanner;
public class Task16 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int [] nr=new int[10];
        int max=0;
        int indeksi=nr[0];
        int repeat=1;
        for(int i=0;i<10;i++){
            nr[i]= input.nextInt();
        }
        for(int i=1;i<10;i++){
            if(nr[i]>indeksi){
                repeat++;
                indeksi=nr[i];
                if(repeat>max){
                    max=repeat;
                }
            }
            else{
                repeat=1;
                indeksi=nr[i];
            }
        }
        System.out.println(max);
    }
}
