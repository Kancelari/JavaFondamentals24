package leksion4;

import java.util.Scanner;

public class Ushtrim_2D_Array {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
       int[][] array2=new int[3][3];
        System.out.println("Vendos vlera per array dydimensionale");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                array2[i][j]=scan.nextInt();
            }
        }
        System.out.println("Printo matrixen e rregullt");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(array2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Printo diagonalen kryesore");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if(i==j){
                    System.out.print(array2[i][j]);
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
