package leksion6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String text= input.nextLine();
        Pattern sneezed=Pattern.compile("['a-zA-Z']+['o','O']+['!']*");
        Matcher krahaso=sneezed.matcher(text);
        if(krahaso.matches()==true) {
            System.out.println("Your word sneezed");
        }
        else{
            System.out.println("Your word don't sneeze");
        }
        }
}
