package ushtrime_Loops;

public class List_numbers {
    public static void main(String[]args){
        int shuma=0;
        //Shfaq numrat nga -20 deri ne 20
        System.out.println("Shfaq numrat nga -20 deri ne 20");
        for (int i=-20;i<21;i++){
            System.out.print(i + " ");
        }
        System.out.println();
        //Shfaq 6 numra e pare
        System.out.println("Shfaq 6 numra e pare");
        for (int i=-20; i<=-15;i++){
            System.out.print(i + " ");
        }
        System.out.println();
        //Shfaq 6 numrat e fundit
        System.out.println("Shfaq 6 numrat e fundit");
        for (int i=-20; i<=20;i++){
            if(i<15){
                continue;
            }
            else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Shfaq gjithe numrat tek
        System.out.println("Shfaq gjithe numrat tek");
        for (int i=-20; i<=20;i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Shfaq gjithe numrat pervec numrit 5
        System.out.println("Shfaq gjithe numrat pervec numrit 5");
        for (int i=-20; i<=20;i++){
            if(i==5){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        //Shfaq gjithe numrat me te medhenje se numri 7 duke perfshire 7
        System.out.println("Shfaq gjithe numrat me te medhenje se numri 7 duke perfshire 7");
        for (int i=-20; i<=20;i++){
            if(i<7){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        //Shfaq gjithe numrat qe pjestohen me 3
        System.out.println("Shfaq gjithe numrat qe pjestohen me 3");
        for (int i=-20; i<=20;i++){
            if(i%3==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Shfaq shumen e te gjithe numrave
        System.out.println("Shfaq shumen e te gjithe numrave");
        for (int i=-20; i<=20;i++){
            shuma=shuma+i;
        }
        System.out.println("Shuma e numrave nga -20 deri ne 20 eshte: " + shuma);

        System.out.println();
        //Shfaq shumen e te gjithe numrave me te > ose = me 4
        System.out.println("Shfaq shumen e te gjithe numrave me te > ose = me 4");
        for (int i=-20; i<=20;i++){
            if(i<4){
                continue;
            }
            else {
                shuma = shuma + i;
            }
        }
        System.out.println("Shuma e numrave me te >= se 4 eshte: " + shuma);
        //Shfaq numrin ne fuqi te dyte
        System.out.println("Shfaq numrin ne fuqi te dyte");
        for (int i=-20; i<=20;i++){
            System.out.println(i + " numri ne fuqi te dyte eshte: " + (i*i));
        }
        //Shfaq numrin dhe mbetjen e tij pas pjestimi me 10
        System.out.println("Shfaq numrin dhe mbetjen e tij pas pjestimi me 10");
        for (int i=-20; i<=20;i++){
            System.out.println(i + " numri ne fuqi te dyte eshte: " + (i%10));
        }

    }
}
