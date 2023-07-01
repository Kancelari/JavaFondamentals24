package assignments;

public class Exercise3_J {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                if (i < j) {
                    System.out.print("# ");
                }
                else if ((j==1) || (i==8)){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
