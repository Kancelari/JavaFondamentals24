package leksion4;

import java.util.Scanner;

public class Oret_Employ {
    public static void main(String[]args) {
        Scanner scan=new Scanner(System.in);
        //Krijo nje array te quajtur employee i cili ruan numrin e oreve te punetoreve
        //Kerko cdo numer oresh nga perdoruesi dhe ruaji ne array.
        //nr max eshte 5;
        int[] employee = new int[5];
        for (int i=0;i<5;i++) {
            System.out.print("Jepni numrin e oreve te punetorit te "+ (i+1)+":");
            employee[i] = scan.nextInt();
        }
        System.out.println(employee[2]);
        System.out.println(employee[4]);
    }
}
