package leksion6;

import java.util.Scanner;

public class Task11 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        String text= input.nextLine();
        String longest="";
        int max=0;
        while(!(text.equals("Enough!"))){
            if(max<text.length() && !(text.equals("Enough!"))){
                max=text.length();
                longest=text;
            }
            text= input.nextLine();
        }
        if(max==0){
            System.out.println("No text provided");
        }
        else {
            System.out.println("Teksti me i gjate i shkruar eshte: " + longest+" gjatesia e tij eshte: "+ max);
        }
    }
}
