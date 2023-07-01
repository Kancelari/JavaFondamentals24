package ushtrime_Loops;
import java.util.Calendar;

public class currentTime {
    public static void main(String[]args){
        Calendar c = Calendar.getInstance();
        int ora=c.get(Calendar.HOUR_OF_DAY);
        int min=c.get(Calendar.MINUTE);
        int sec=c.get(Calendar.SECOND);
        System.out.println("Current time: " + ora + ":" + min + ":" + sec);
        System.out.println();
        System.out.println("Hour:");
        for (int i=1; i<=ora;i++){
            if(i%10==0){
                System.out.print("*");
                System.out.println();
            }
            else {
                System.out.print("*");
            }
        }
        System.out.println();
        System.out.println("Minute:");
        for (int i=1; i<=min;i++){
            if(i%10==0){
                System.out.print("*");
                System.out.println();
            }
            else {
                System.out.print("*");
            }
        }
        System.out.println();
        System.out.println("Second:");
        for (int i=1; i<=sec;i++){
            if(i%10==0){
                System.out.println();
            }
            else {
                System.out.print("*");
            }
        }
    }
}
