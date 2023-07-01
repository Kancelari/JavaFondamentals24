package leksion6;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Period;
public class Task17 {
    public static void main(String[]args) throws ParseException {
        Scanner input=new Scanner(System.in);
        System.out.println("Ne cilen date eshte kursi i rradhes (Vendosni daten dd-MM-yyyy): ");
        String kursi= input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate kursi1 = LocalDate.parse(kursi, formatter);
        LocalDate data=LocalDate.now();
        System.out.println("Data sot eshte: "+ data);
        System.out.println("Data e ardhshme e kursit eshte me: "+ kursi1);
        Period dite = Period.between(data,kursi1);
        int diff=dite.getDays();
        System.out.println("Deri ne dite tjeter te kursit keni: "+diff+" dite.");
    }
}
