package leksion6;
import java.util.Scanner;
public class Task20 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int random = (int)(Math.random()*(100-0+1)+0);
        System.out.println(random);
        System.out.print("Provo te gjesh numrin qe po mendoj eshte nje numer nga 0-100: ");
        int numri= input.nextInt();
        if(numri==random){
            System.out.println("Urime ju gjetet numrin");
        }
        else{
            while(numri!=random){
                if(numri>random){
                    System.out.println("Numri me i madh!");
                    System.out.print("Provoni perseri: ");
                    numri= input.nextInt();
                }
                else{
                    System.out.println("Numri me i vogel!");
                    System.out.print("Provoni perseri: ");
                    numri= input.nextInt();
                }
            }
            System.out.println("Urime ju e gjetet numrin");
        }
    }
}
