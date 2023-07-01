package assignments;
public class Exercise3_C {
    public static void main(String[]args){
        for (int i= 1; i<=8; i++)
        {
            for (int j=1; j<=8-i; j++)
            {
                System.out.print("  ");
            }
            for (int k=0;k<i;k++)
            {
                System.out.print(" #");
            }
            System.out.println();
        }
    }
}
