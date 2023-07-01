package assignments;

public class Exercise3_H {
    public static void main(String[]args){
        for (int i=1;i<=7;i++){
            for (int j=1;j<=7; j++){
            if(i==1 || i==7){
                System.out.print("# ");
            }
            else{
                if(((i+j)==7+1) || (j==i)){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
                }
            }
            System.out.println();
        }
    }
}
