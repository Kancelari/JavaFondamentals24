package leksion7_Ool;

public class CarMain {
    class InnerClass{
        String key;
        String value;
    }
    //Nje me class inner statike mund ta inicializojme vetem ne static method
    //Kurse jo statike ne methoda jo statike

    public static  void methodOfLocalClass(){
     class LocalClass {
         String key;
         String value;
     }
         LocalClass l1 = new LocalClass();
         l1.key ="something";
         l1.value ="somethingElse";
        System.out.println("Local class l1 has key: "+ l1.key + " and value: "+ l1.value);
     }

    public void methodOfInnerClass(){
        InnerClass newObject = new InnerClass();
    }
    public static void main(String args[]){
        Mercedes m1=new Mercedes("Sedan","Red", "C Class", "CDI", 2.2f, null);
        m1.runEngine();
        //nese duam te therrasim nje inner class nga nje klase tjeter duhet ta deklarojme statike
        //qe te thirret ne formen si me poshte
        Mercedes.Company company = new  Mercedes.Company();
        company.companyName="Mercedes Benz";
        company.foundingYear=1880;
        System.out.printf("Company Name: %s, Founding year: %d\n", company.companyName, company.foundingYear);
        Mercedes.Owner myOwner = m1.initializeOwner();
        myOwner.name="Afrim";
        myOwner.surname="Patalaku";
        System.out.println("myOwner name is "+ myOwner.name + " and surname is "+myOwner.surname);
        Mercedes.Owner o2 = Mercedes.initializeOwnerStatic();
        o2.name = "anonymous";
        o2.surname = "anonymous";
        System.out.println("myOwner name is "+ o2.name + " and surname is " + o2.surname );

        methodOfLocalClass();
        //Nje inicjalizim i nje klase anonime behet duke implementuar nje klas
        //abstrakte e te gjitha metodat e saj abstrakte si me poshte.
       // Car v1 = new Car("sedan", "red") {
         //   public static final String version ="new version";
           // @Override
            //protected void runEngine() {
          //     System.out.printf("Anonymous car object with color: %s is running\n", getColor());
          //  }
        //};
        //v1.runEngine();
        String fuelType=m1.getFuelType();
        System.out.println("m1 object fuel type is "+ fuelType);

    }
}
