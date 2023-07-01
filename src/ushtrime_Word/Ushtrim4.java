package ushtrime_Word;

public class Ushtrim4 {
    public static void main(String[]args){
        int [] nr=new int[]{50, -20,0,30,40,60,10};
        int max=nr[0];
        int min=nr[0];
        for (int i=1; i<nr.length;i++){
            if(nr[i]<min){
                min=nr[i];
            }
            if(nr[i]>max){
                max=nr[i];
            }
        }
        System.out.println("Min= " + min + " Max= " + max );
    }
}
