package assignments;

import java.util.Scanner;

public class Exercise3_K {
    //method draw a pattern
    static void Pattern(int a, char x){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                if (i < j) {
                    System.out.print(x +" ");
                }
                else if ((j==1) || (i==a)){
                    System.out.print(x + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        char character=sc.next().charAt(0);
        Pattern(row,character);
    }
}
