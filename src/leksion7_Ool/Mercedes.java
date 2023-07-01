package leksion7_Ool;
public class Mercedes extends Car implements Vehicle{
    private String model;
    private String engine;
    private float consume;
    private String fuelType;
    @Override
    public String getFuelType() {
        if(this.fuelType==null || this.fuelType.isEmpty()){
            return fuel;
        }
        return this.fuelType;
    }
    static class Company{
        String companyName;
        int foundingYear;
    }
    class Owner{
        String name;
        String surname;
    }
    public Mercedes(String type, String color, String model, String engine, float consume, String fuelType){
        super (type, color);
        this.model=model;
        this.engine=engine;
        this.consume=consume;
        this.fuelType=fuelType;
    }
//Abstract methods always should be overridden
    @Override
    protected void runEngine() {
        System.out.printf("Mercedes of types: %s  with color: %s , consume: %.2f\n", super.getType() ,super.getColor(), consume);
    }
    public  Owner initializeOwner(){
        return new Owner();
    }
    public static Owner initializeOwnerStatic(){
        Mercedes object =  new Mercedes(null,null,null,null,0.0f,null);
        return object.initializeOwner();
    }
}
