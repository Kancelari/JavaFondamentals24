package leksion4;
import java.util.Scanner;
public class Array_Mbledhje {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int [] numra=new int[10];
        int shuma=0;
        for (int i=0;i<10;i++){
            System.out.print("Jepni numrin e "+(i+1)+": ");
            numra[i]=scan.nextInt();
            if(numra[i]%2==0){
                shuma+=numra[i];
            }
        }
        System.out.println("Shuma e numrave cift qe vendoset eshte: "+ shuma);
    }
}
