package assignments;

import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Sa deshironi te jete tabela e shumezimit: ");
        int nr=sc.nextInt();
        for (int i=1;i<=nr; i++){
            System.out.print("+---");
        }
        System.out.println("+");
        for (int i=1; i<=nr; i++){
            for (int j=1;j<=nr;j++){
                int x=i*j;
                System.out.print("| "+x+" ");
            }
            System.out.println("|");
            for (int k=1;k<=nr; k++){
                System.out.print("+---");
            }
            System.out.println("+");
        }
            }
        }
