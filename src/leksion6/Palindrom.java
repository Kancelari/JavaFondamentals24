package leksion6;

import java.util.Scanner;

public class Palindrom {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        String text= input.nextLine();
        String reverse="";
        int j=text.length()-1;
        for(int n=j;n>=0;n--){
            reverse=reverse+text.charAt(n);;
        }
        if(text.equals(reverse)){
            System.out.println("Teksti qe shkruat eshte palindrom");
        }
        else{
            System.out.println("Teksti qe shkruat nuk eshte nje palindrom");
        }
    }
}
