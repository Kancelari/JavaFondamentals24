package leksion6;
import java.util.Scanner;
public class Task13 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        String text= input.nextLine();
        int hapesira1=0, hapsira2=0;
        for(int i=1;i<text.length();i++) {
            if(text.charAt(i)==' '){
                hapsira2=i+1;
            }
                System.out.print(text.subSequence(hapesira1, hapsira2));
                System.out.print(text.subSequence(hapesira1, hapsira2));
                hapesira1=hapsira2;
        }
        System.out.print(text.subSequence(hapsira2,text.length())+" ");
        System.out.print(text.subSequence(hapsira2,text.length()));
        }
    }

