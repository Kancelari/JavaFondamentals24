package leksion6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Task15 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        List<Long> list = new ArrayList<Long>();
        long[] largeNums=new long[10];
        System.out.println("Vendosni 10 numra: ");
        for (int i=0;i< largeNums.length;i++){
            largeNums[i]= input.nextLong();
        }
        for (int i=0; i<10;i++){
            for(int j=i+1;j<10;j++){
                if(largeNums[j]==largeNums[i] && !list.contains(largeNums[i])){
                    list.add(largeNums[i]);
                }
            }
        }
        System.out.println(list);
    }
}
