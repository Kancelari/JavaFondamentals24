package leksion6;
public class Inventar {
    private String KodProdukti;
    private int SasiaStok;
    private float CmimiNjesi;
    private char Masa;
    public Inventar(String kodProdukti, int sasiaStok, float cmimiNjesi) {
        KodProdukti = kodProdukti;
        SasiaStok = sasiaStok;
        CmimiNjesi = cmimiNjesi;
    }
    public Inventar() {    }
    public void setKodProdukti(String kodProdukti) {
        KodProdukti = kodProdukti;
    }
    public void setSasiaStok(int sasiaStok) {
        if(sasiaStok<0){
            System.out.println("Numri qe vendoset eshte i palejuar vendosni nje numer pozitiv.");
        }
        else {
            SasiaStok = sasiaStok;
        }
    }
    public void setCmimiNjesi(float cmimiNjesi) {
        CmimiNjesi = cmimiNjesi;
    }
    public void setMasa(char masa) {
        Masa = masa;
    }
    public String getKodProdukti() {
        return KodProdukti;
    }
    public int getSasiaStok() {
        return SasiaStok;
    }
    public float getCmimiNjesi() {
        return CmimiNjesi;
    }
    public char getMasa() {
        return Masa;
    }
    public void PrintoInfo(){
        System.out.println("Produkti me kod "+ KodProdukti+" "+" ka nje sasi stoku "+SasiaStok+" ku cmimi per njesi eshte "+
                CmimiNjesi+" dhe masa eshte "+Masa);
    }
    public float XhiroAktuale(int sasiaStok, float cmimiNjesi){
          return sasiaStok * cmimiNjesi;
    }
}
