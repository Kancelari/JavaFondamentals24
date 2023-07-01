package leksion6;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float nr1 = input.nextFloat();
        char op = input.next().charAt(0);
        float nr2 = input.nextFloat();
        switch (op) {
            case '+':
                System.out.println(nr1+nr2);
                break;
            case '-':
                System.out.println(nr1-nr2);
                break;
            case '*':
                System.out.println(nr1*nr2);
                break;
            case '/':
                if(nr2==0){
                    System.out.println("Nuk lejohet pjestimi me zero");
                }
                else{
                    System.out.println(nr1/nr2);
                }
                break;
            default:
                System.out.println("Operatori qe ju vendoset eshte i gabuar.");
                break;
        }
    }
}
