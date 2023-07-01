package leksion6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ThirrKlasat {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        Building b1=new Building();
        b1.setTipiPrones("Pallat");
        b1.setSip(107.5F);
        b1.setCmimiPerM2(800);
        b1.setSconto(true);
        b1.setVleraSconto(10);
        b1.printoTeDhenat();
        float x=b1.cmimiShitjes(b1.getSconto());
        System.out.println("Cmimi i ketij pallati eshte: " + x);
        Inventar i1=new Inventar();
        i1.setKodProdukti("I23451");
        i1.setSasiaStok(5);
        i1.setCmimiNjesi(35.4f);
        i1.setMasa('M');
        i1.PrintoInfo();
        System.out.println(i1.XhiroAktuale(i1.getSasiaStok(),i1.getCmimiNjesi()));
        Event e1=new Event();
        e1.setTipologjia("Koncert recital");
        e1.setNrRezervime(250);
        e1.setKapacitetiTotal(260);
        e1.setKengetari("Alban Skenderaj");
        String data="20-06-2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataKoncertit = LocalDate.parse(data, formatter);
        e1.setDataKoncertit(dataKoncertit);
        e1.AfishoteDhenat();
        e1.checkRezervime(e1.getKapacitetiTotal());
    }
}
