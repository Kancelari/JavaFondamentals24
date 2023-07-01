package leksion6;
import java.util.Scanner;
public class Task12 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        String text=input.nextLine();
        int karaktere=text.length();
        int hapsira=0;
        for (int i=0;i<text.length();i++){
            if(text.charAt(i) == ' '){
                hapsira++;
            }
        }
        System.out.println("Perqindja e hapesirave ne tekstin tuaj eshte " + ((float)hapsira/(float)karaktere*100.0) + "%");
    }
}
