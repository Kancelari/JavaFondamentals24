package assignments;

public class Multiplication_Ttable {
    public static void main(String[]args){
        for (int i=1; i<=10; i++){
            for (int j=1;j<=10;j++){
                int x=i*j;
                System.out.print(String.format("%4s", x));
            }
            System.out.println();
        }
    }
}
