package ushtrime_Array;

public class Board_Storing_100 {
    public static void main(String[]args){
        int[] money = {1, 2, 5, 10, 20};
        int shuma=0;
        int i=0;
        do {
            int idx = (int) (Math.random() * money.length + 1);
            i++;
            shuma=shuma+money[idx-1];
            if(shuma>100){
                shuma=shuma-money[idx-1];
            }
            else if(shuma==100){
                System.out.println("Vlera e terhequr\tShuma");
                System.out.println(money[idx-1] + "\t\t\t\t\t"+shuma);
            }
            else{
                System.out.println("Vlera e terhequr\tShuma");
                System.out.println(money[idx-1] + "\t\t\t\t\t"+shuma);
            }
        }
        while(shuma<100);
        System.out.println();
        System.out.println("Shuma eshte: " + shuma);
        System.out.println("U deshen: " + i +" veprime per te terhequr kete shume.");
    }
}
