package leksion5.Klasat;

public class CompjuterTest {
    public static void main(String []args){
        Computer com=new Computer();
        com.cmimi=21000;
        com.vitprodhimi=2022;
        com.pershkrimi="Kompjuteri me i mire i vitit";
        com.kategori="Desktop";
        com.marka="HP";
        com.afishoTeDhenat();
        System.out.println("A eshte cmimi me i shtrejte se 15000: "+ com.kontrollCmimi());
    }
}
