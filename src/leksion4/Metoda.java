package leksion4;
import java.util.Scanner;
public class Metoda {
    static void Afisho(){
        System.out.println("Po afishojme nga trupi i metodes Afisho");
        System.out.println("Hello World");
    }
    static void AfishoNumer(int x){
        System.out.println("Numri juaj: "+x);
    }
    static void printoMax(int x, int y){
        if(x>y){
            System.out.println(x);
        }
        else{
            System.out.println(y);
        }
    }
    static int ktheMax(int x, int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        printoMax(a,b);
        int max;
        max=ktheMax(10,15);
        System.out.println("Maksimumi i numrave me metoden ktheMax(): "+ max);
        Afisho();
        AfishoNumer(3);
    }
}
