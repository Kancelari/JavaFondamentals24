package leksion3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailPattern {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Shkruani emailin tuaj");
        String email=scan.nextLine();
        Pattern email_form= Pattern.compile("[a-zA-Z]*@gmail.com");
        Matcher email_ok=email_form.matcher(email);
        System.out.println("Emaili qe vendoset "+ email_ok.matches());
        System.out.println(email.contains("@gmail.com"));
    }
}
