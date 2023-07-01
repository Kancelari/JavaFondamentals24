package conditional_Statment_Exercises;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Exercise_2 {
    public static void main(String[]args){
        LocalDate today = LocalDate.now();
        Calendar c = Calendar.getInstance();
        Date hour=new Date();
        c.setTime(hour);
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        int ora=c.get(Calendar.HOUR_OF_DAY);
        int dita=dayOfWeek.getValue();
        int dita_muajit=today.getDayOfMonth();
        int muaji=today.getMonthValue();
        System.out.println(LocalTime.now());
        System.out.println(ora);
        System.out.println("Numri i dites se javes eshte: " + dita);
        System.out.println("Numri i dites se muajit eshte: " + dita_muajit);
        System.out.println("Numri i  muajit eshte: " + muaji);
        if(ora>=1 && ora<=12){
            System.out.println("Mengjes: ");
        }else if(ora>=12 && ora<=16){
            System.out.println("Drek:");
        }else if(ora>=16 && ora<=21){
            System.out.println("Pasdite: ");
        }else{
            System.out.println("Darke: ");
        }
        if (dita>5) {
                System.out.println("Dite pune");
            }
        else{
                System.out.println("Dite pushim");
            }
            if (dita_muajit>=10){
                System.out.println("Keni hyre ne ditet e marrjes se pages");
            }
            else{
                int dif=10-dita_muajit;
                System.out.println("Juve ju duhet dhe "+dif+" per te marrur rrogen");
            }
            switch(muaji){
                case 12,1,2:{
                System.out.println("Jemi ne dimer");
                break;
            }
                case 3,4,5: {
                    System.out.println("Jemi ne pranver");
                    break;
                }
                case 6,7,8: {
                    System.out.println("Jemi ne vere");
                    break;
                }
                case 9,10,11: {
                    System.out.println("Jemi ne vjeshte");
                    break;
                }
                default:{
                    System.out.println("Numri i muajit i gabuar");
                    break;
                }
            }
        }

    }

