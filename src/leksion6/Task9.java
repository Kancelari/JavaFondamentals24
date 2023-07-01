package leksion6;
import java.util.Scanner;
public class Task9 {
    public static void main (String[]args){
        Scanner input=new Scanner(System.in);
        int wl=input.nextInt();
        int wh=4;
        int x=wh-1;
        for (int i=0;i<wh;i++){
            for(int j=0;j<wh*wl*2;j++){
                if(j%(wh*2)==x||j%(wh*2)==wh+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            x--;
            System.out.println("");
        }

    }
}
