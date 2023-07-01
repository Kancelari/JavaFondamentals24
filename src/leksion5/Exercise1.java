package leksion5;

import java.util.Scanner;

public class Exercise1 {
    static void shfaqArray(int arr[][]){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
    static int maxNr(int arr[][]){
        int max=arr[0][0];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String []args){
        int [][] arr=new int[3][3];
        Scanner input=new Scanner(System.in);
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=input.nextInt();
            }
        }
        shfaqArray(arr);
        System.out.println("Numri me i madh ne array eshte: " + maxNr(arr));
    }
}
