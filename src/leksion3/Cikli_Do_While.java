package leksion3;
import java.util.Scanner;
public class Cikli_Do_While {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int x=1;
        int shuma=0;
        do{
            System.out.print("Jepni numrin: ");
            int numri=scan.nextInt();
            x++;
            shuma+=numri;
        }
        while(x<=5);
        float avg=(float)(shuma/5.0);
        System.out.println("Mesatarja e ketyre numrave eshte: "+ avg);
    }
}