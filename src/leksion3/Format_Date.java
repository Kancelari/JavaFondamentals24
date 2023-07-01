package leksion3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Format_Date {
    public static void main(String[]args){
        //Krijimi i nje formati te dates
        Scanner scan=new Scanner(System.in);
        System.out.println("Vendosni daten: ");
        String data=scan.nextLine();
        System.out.println("Data qe vendoset eshte: "+data);

        Pattern form_date=Pattern.compile("[0-9]{1,2}[/[/]/-][0-9]{1,2}[/[/]/-][0-9]{2,4}");
        Matcher ok_date= form_date.matcher(data);
        System.out.println(ok_date.matches());
    }
}
