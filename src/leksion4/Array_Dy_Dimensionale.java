package leksion4;
import java.util.Scanner;
public class Array_Dy_Dimensionale {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int [][] arrayDY=new int[3][3];
        System.out.println("Vendos vlera per array dydimensionale");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arrayDY[i][j]=scan.nextInt();
            }
        }
        System.out.println("Po te afishojme vlerat sipas indekseve");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arrayDY[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
