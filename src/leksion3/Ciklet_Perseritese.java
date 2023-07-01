package leksion3;
import java.util.Scanner;
public class Ciklet_Perseritese {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int x=1;
        int shuma=0;
        while(x<=5){
            System.out.print("Jepni numrin: ");
            int numri=scan.nextInt();
            x++;
            shuma+=numri;
        }
        float avg=(float)(shuma/5.0);
        System.out.println(avg);
    }
}
