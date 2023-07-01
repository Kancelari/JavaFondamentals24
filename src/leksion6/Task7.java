package leksion6;
import java.util.Scanner;
public class Task7 {
    /*public static int fibo(int n){
        int nr1=0, nr2=1,shuma=0;
        if (n==1){
        return 1;
        }
        else{
            shuma=nr1+nr2;
            nr1=nr2;
            nr2=shuma;
            return shuma+fibo(nr1);
        }
    }
    */
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int nr= input.nextInt();
        int nr1=0, nr2=1, shuma=0;
        System.out.print(1 + " ");
        for(int i=2;i<=nr;i++){
            shuma=nr1+nr2;
            nr1=nr2;
            nr2=shuma;
            System.out.print(shuma + " ");
        }
        //int l=fibo(nr);
        //System.out.println("Fibonaci nga rekursivi "+l);
    }
}
