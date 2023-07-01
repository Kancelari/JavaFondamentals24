package leksion2;

public class Ushtrim2If_Else {
    public static void main(String[]args){
        int mosha=14;
        if (mosha>=18){
            System.out.println("Ju jeni nje votues i rregullt.");
        }
        else if (mosha==17){
            System.out.println("Ju ju duhet dhe nje vite per te votuar.");
        }
        else{
            int dif;
            dif=18-mosha;
            System.out.println("Ju ju duhen dhe " + dif + " vite per te votuar.");
        }
        //Instruksioni pasardhes do te ekzekutohet ne cdo rast
        System.out.println("Ketu jemi jashte struktures kushtezuese.");
    }
}
