package leksion6;

import java.util.Scanner;

public class Task13_1 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String output="";
        String []ArrayText=text.split(" ");
        for (int i = 0; i<ArrayText.length; i++){
            System.out.print(ArrayText[i]+" "+ArrayText[i]+" ");
            output=ArrayText[i]+" "+ArrayText[i]+" ";
        }
        output=output.trim();
    }
}
