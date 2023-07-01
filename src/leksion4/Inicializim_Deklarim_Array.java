package leksion4;

public class Inicializim_Deklarim_Array {
    public static void main(String[]args){
        //krijojme nje array dhe i japim vlera
        int [] notat=new int[]{9,6,7,8,4,5,9,10,8,7};
        String[] ListaEmerore=new String[]{"A.B","D.V","E.T","T.P","L.R","I.G","P.P","A.M","O.Z","A.P"};
        double[] Piket=new double[]{32.6,24.5,30.6,43.5,32.6,24.5,30.6,43.5,32.6,24.5};
        System.out.println(notat[4]);
        System.out.println("Studenti me iniciale: "+ ListaEmerore[0]+" ka marre noten: "+ notat[0]);
        System.out.println("Studenti me iniciale: "+ ListaEmerore[1]+" ka marre noten: "+ notat[1]);
        System.out.println("Studenti me iniciale: "+ ListaEmerore[2]+" ka marre noten: "+ notat[2]);
        System.out.println("Studenti me iniciale: "+ ListaEmerore[3]+" ka marre noten: "+ notat[3]);
        System.out.println("Studenti me iniciale: "+ ListaEmerore[4]+" ka marre noten: "+ notat[4]);
        System.out.println("Studenti me iniciale: "+ ListaEmerore[5]+" ka marre noten: "+ notat[5]);
        System.out.println("Studenti me iniciale: "+ ListaEmerore[6]+" ka marre noten: "+ notat[6]);
        System.out.println("Studenti me iniciale: "+ ListaEmerore[7]+" ka marre noten: "+ notat[7]);
        System.out.println("Studenti me iniciale: "+ ListaEmerore[8]+" ka marre noten: "+ notat[8]);
        System.out.println("Studenti me iniciale: "+ ListaEmerore[9]+" ka marre noten: "+ notat[9]);

        //Me poshte kodi deklarim pa inicializim direkt
        int[] totMungesa=new int[10];
        totMungesa[0]=3;
        totMungesa[1]=2;
        totMungesa[3]=0;

        System.out.println("Numri i mungesave per studentin e pare "+ totMungesa[0]);
        System.out.println("Numri i mungesave per studentin e dyte "+ totMungesa[1]);
        System.out.println("Numri i mungesave per studentin e trete "+ totMungesa[2]);
        System.out.println("Numri i mungesave per studentin e katert "+ totMungesa[3]);
        //krijo nje array qe permban karaktere dhe ka emrin genderstudent
        //te realizohet me inicializim ne deklarim dhe vlerdhenie pas deklarimit
        char[] genderstudent=new char[]{'m','f','f','m','f', 'm','f','f','m','f'};
        System.out.println(genderstudent[0]);
        System.out.println(genderstudent[1]);
        System.out.println(genderstudent[2]);
        System.out.println(genderstudent[3]);
        System.out.println(genderstudent[4]);
        System.out.println(genderstudent[5]);
        System.out.println(genderstudent[6]);
        System.out.println(genderstudent[7]);
        System.out.println(genderstudent[8]);
        System.out.println(genderstudent[9]);

        char[] GenderStudent=new char[10];
        GenderStudent[0]='m';
        GenderStudent[1]='f';
        GenderStudent[2]='f';
        GenderStudent[3]='m';
        GenderStudent[4]='f';
        GenderStudent[5]='m';
        GenderStudent[6]='f';
        GenderStudent[7]='f';
        GenderStudent[8]='m';
        GenderStudent[9]='f';

    }
}
