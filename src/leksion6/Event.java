package leksion6;
import java.time.LocalDate;
import java.time.Period;
public class Event {
    private String Tipologjia;
    private int nrRezervime;
    private int KapacitetiTotal;
    private String Kengetari;
    private LocalDate DataKoncertit;
    public Event(){}
    public Event(String tipologjia, int nrRezervime, int kapacitetiTotal, LocalDate dataKoncertit) {
        Tipologjia = tipologjia;
        this.nrRezervime = nrRezervime;
        KapacitetiTotal = kapacitetiTotal;
        DataKoncertit = dataKoncertit;
    }
    public String getTipologjia() {
        return Tipologjia;
    }
    public void setTipologjia(String tipologjia) {
        Tipologjia = tipologjia;
    }
    public int getNrRezervime() {
        return nrRezervime;
    }
    public void setNrRezervime(int nrRezervime) {
        this.nrRezervime = nrRezervime;
    }
    public int getKapacitetiTotal() {
        return KapacitetiTotal;
    }
    public void setKapacitetiTotal(int kapacitetiTotal) {
        KapacitetiTotal = kapacitetiTotal;
    }
    public String getKengetari() {
        return Kengetari;
    }
    public void setKengetari(String kengetari) {
        Kengetari = kengetari;
    }
    public LocalDate getDataKoncertit() {
        return DataKoncertit;
    }
    public void setDataKoncertit(LocalDate dataKoncertit) {
        if(CheckDate(dataKoncertit)==true){
            this.DataKoncertit=dataKoncertit;
        }
    }
    public void AfishoteDhenat(){
        if(getDataKoncertit()==null){
            System.out.println("Data e koncertit eshte vendosur gabim.");
        }
        else if (!checkRezervime(getKapacitetiTotal())) {
            System.out.println("Te gjithe biletat jane shitur.");

        } else {
            System.out.println("Koncerti eshte " + Tipologjia + " jane bere " + nrRezervime + " rezervime, kapaciteti maximal eshte: " +
                    KapacitetiTotal + " " + Kengetari + " eshte performuesi i ketij eventi, me date " + DataKoncertit);
        }
    }
    public boolean checkRezervime(int KapacitetiTotal){
        boolean vende=false;
        if(nrRezervime>KapacitetiTotal) {
            vende=false;
        }
        else{
            vende=true;
        }
        return vende;
    }
    public boolean CheckDate(LocalDate dataKoncertit){
        LocalDate datasot = LocalDate.now();
        Period dite;
        dite = Period.between(datasot, dataKoncertit);
        int diff=dite.getDays();
        boolean dataok=false;
        if (diff<0) {
            dataok=false;
        }
        else {
            dataok=true;
        }
        return dataok;
    }
}
