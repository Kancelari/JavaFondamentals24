package leksion4;
import java.util.Scanner;
public class VleraMax {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int[] nr=new int[5];
        int max= scan.nextInt();
        nr[0]=max;
        for(int i=1; i<5;i++){
            nr[i]= scan.nextInt();
            if(nr[i]>max){
                max=nr[i];
            }
        }
        System.out.println("Numri me i madh qe vendoset eshte: "+ max);
    }
}
