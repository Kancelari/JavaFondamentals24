package leksion1;

public class ConvrtionNumbers {
    public static void main (String []args){
        int x=44;
        double y=78.34d;
        float z=3.4f;

        //casting
        //varibla output=(tip konvertimi) variabel aktual
        x=(int)z;
        System.out.println(x);
        char c='a';
        x=(int)c;
        System.out.println(x);
        String strnga1;
        double n=99.9989;
        int m=(int)Math.round(n);
        System.out.println(m);
    }
}
