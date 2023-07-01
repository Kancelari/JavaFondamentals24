package leksion5.Klasat;

public class Computer {
    public int vitprodhimi;
    public String kategori;
    public String marka;
    public float cmimi;
    public String pershkrimi;

    public void afishoTeDhenat(){
        System.out.println("Viti i prodhimit eshte: "+vitprodhimi+" ben pjese ne kategorin "+kategori+" marka eshte "+marka+" cmimi eshte "+cmimi+" "+pershkrimi);
    }
    public boolean kontrollCmimi(){
        boolean x=false;
        if(cmimi>15000){
            x=true;
        }
        return x;
    }
}
