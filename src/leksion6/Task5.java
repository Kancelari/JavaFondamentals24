package leksion6;

import java.util.Scanner;
public class Task5 {
    public static boolean isPrime(int n){
        for (int j=2; j<n;j++) {
            if (n % j == 0)
                return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for (int i=2; i<n; i++)
        {
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
        }
    }
