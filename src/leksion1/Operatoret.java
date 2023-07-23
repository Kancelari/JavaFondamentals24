package leksion1;

public class Operatoret {
    public static void main (String[]args){
        int var1=5;
        int var2=10;
        int varResult;
        varResult=var1+var2;
        System.out.println(varResult);
        varResult+=2;
        System.out.println(varResult);
        varResult=var1-var2;
        System.out.println(varResult);
        varResult=var1*var2;
        System.out.println(varResult);
        varResult=var1/var2;
        System.out.println(varResult);
        varResult=var1%var2;
        System.out.println(varResult);
        int value=3;
        System.out.println(value++);
        System.out.println(value--);
    }
}
