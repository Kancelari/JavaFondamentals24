package leksion6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int nr= input.nextInt();
        for (int i=1; i<=nr;i++ ){
            if (i%3==0 && i%7==0){
                System.out.println("Fizz Buzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%7==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
