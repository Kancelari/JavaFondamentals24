package leksion6;
import java.util.Scanner;
public class Task10 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int shuma=0;
        String nr=String.valueOf(x);
        for(int i=0;i<nr.length();i++){
            shuma=shuma+(x%10);
            x=x/10;
        }
        System.out.println("Shuma e numrit tuaj eshte: " + shuma);
    }
}
