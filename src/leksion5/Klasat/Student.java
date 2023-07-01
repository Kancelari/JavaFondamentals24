package leksion5.Klasat;

public class Student {
    //Konstruktori default
    public Student(){}
    //Atributet
    public String emer;
    public String mbiemer;
    public String ID;
    public int mosha;
    //Metodat
    public void AfishoTeDhenat(){
        System.out.println("Emer: "+emer+" Mbiemer: "+mbiemer+" ID: "+ID+" Mosha: "+ mosha);
    }
    public int KtheVitLindje(){
        return 2023-mosha;
    }
}
