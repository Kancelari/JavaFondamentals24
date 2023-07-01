package leksion2;

public class Ushtrim3_If_Else {
    public static void main(String[]args){
        int nota=14;
        if (nota==10){
            System.out.println("Ekselent");
        }
        else if (nota>4 && nota<10){
            System.out.println("Kalues");
        }
        else if (nota==4){
            System.out.println("Ngeles");
        }
        else{
            System.out.println("Note e pasakte.");
        }
    }
}
