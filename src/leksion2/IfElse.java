package leksion2;

public class IfElse {
    public static void main(String []args){
        int x=4;
        //Nqs vlera e variablit x > 0 ekzekuto cdo gje brenda {}
        if (x>0){
            System.out.println("Numeri eshte pozitiv");
            x+=1;
        }
        if (x%2==0){
            System.out.println("Numeri eshte cift");
        }
        else{
            System.out.println("Numer negative");
        }
        System.out.println("Dolem nga struktura kushtezuese");
    }
}
