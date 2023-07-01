package leksion1;

public class OperatorRelacional {
    public static void main(String []args){
        int numer1=4;
        int numer2=7;
        boolean output=false;
        System.out.println(output);
        output=numer1==numer2;
        numer1=7;
        output=(numer1==numer2);
        System.out.println(output);
        //>, <=
        int numerRelacional1=4;
        int numerRelacional2;
        numerRelacional2=5;
        System.out.println(numerRelacional1>numerRelacional2); //4>5=false
    }
}
