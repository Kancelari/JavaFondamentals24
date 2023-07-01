package leksion6;
import java.util.Scanner;
public class Task19 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        Poem p1=new Poem(new Author("Kadare"),25);
        Poem p2=new Poem(new Author("Frasheri"),45);
        Poem p3=new Poem();
        System.out.println("Jepni te dhenat e librit:");
        System.out.print("Autori: ");
        String surname= input.nextLine();
        System.out.print("Jepni numrin e strofave: ");
        int x= input.nextInt();
        p3.setCreator(surname);
        p3.setStropheNumbers(x);
        Poem [] poems=new Poem[3];
        poems[0]=p1;
        poems[1]=p2;
        poems[2]=p3;
        System.out.println(p1.getCreator().surname);
        System.out.println(p1.getStropheNumbers());
        int max=poems[0].getStropheNumbers();
        String shkrimtari="";
        int strofa=0;
        for(int i=1;i< poems.length;i++){
            if(poems[i].getStropheNumbers()>max){
                max=poems[i].getStropheNumbers();
                shkrimtari=poems[i].getCreator().surname;
                strofa=poems[i].getStropheNumbers();
            }
        }
        System.out.println("Shkrimtari me vepren me me shume strofa eshte: "+shkrimtari+" vepra e tij ka "+strofa+" strofa.");
    }
}
