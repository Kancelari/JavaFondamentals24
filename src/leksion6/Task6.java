package leksion6;
import java.util.Scanner;
public class Task6 {
    public static float shuma(float n)
    {
        if (n == 1)
            return 1;
        else
            return 1 / n + (shuma(n - 1));
    }
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int nr= input.nextInt();
        float rez=shuma(nr);
        System.out.println(rez);
    }
}
