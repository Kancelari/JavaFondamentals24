package leksion5.Klasat;

public class TestKlasa {
    public static void main(String args[]){
        Student studentInformatika=new Student();
        studentInformatika.emer="Afrim";
        studentInformatika.mbiemer="Patalaku";
        studentInformatika.mosha=34;
        studentInformatika.ID="I39450945L";
        studentInformatika.AfishoTeDhenat();
        System.out.println("Ky student ka lindur ne "+studentInformatika.KtheVitLindje());
        //Po punojme me klasen employee
        Employee punetor1=new Employee();
        punetor1.setEmer("Arben");
        punetor1.setMbiemer("Xyz");
        punetor1.setNr_OrePune(40);
        punetor1.setPaga_ore_pune(400);
        punetor1.setID("A098765432G");
        System.out.println("Pershendetje "+punetor1.getEmer()+" "+punetor1.getMbiemer());
        System.out.println("Rroga juaj eshte " + punetor1.rroga());
        Employee newEmp=new Employee("Lorik", "Cana");
        System.out.println("Pershendetje "+newEmp.getEmer()+" "+newEmp.getMbiemer());
        System.out.println("Rroga juaj eshte "+newEmp.rroga());
        System.out.println("Po punojme me konstruktoret");
        Liber liber1=new Liber("Java Fondamentals", "SDA", "A123456L" );
        System.out.println("Titulli "+ liber1.getTitle());
        System.out.println("Autori "+ liber1.getAuthor());
        System.out.println("ISBN "+ liber1.getISBN());
    }
}
