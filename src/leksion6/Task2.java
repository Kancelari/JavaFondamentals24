package leksion6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Jepni peshen tuaj: ");
        float weight= input.nextFloat();
        System.out.print("Jepni gjatesin ne cm: ");
        int height= input.nextInt();
        float BMI=(float)((weight)/((height/100.0)*(height/100.0)));
        if(BMI>=18.5 && BMI<=24.9){
            System.out.println("BMI juaj eshte: " +BMI + " BMI optimal");
        }
        else{
            System.out.println("BMI juaj eshte: " +BMI + " BMI not optimal");
        }
    }
}
