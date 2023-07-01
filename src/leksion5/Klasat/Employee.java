package leksion5.Klasat;

public class Employee {

    private String emer;
    private String mbiemer;
    private int paga_ore_pune;
    private int nr_OrePune;
    private String ID;
    public Employee(){}
    public Employee(String emer, String mbiemer){
        this.emer=emer;
        this.mbiemer=mbiemer;
    }
    public void setEmer(String name){
        this.emer=name;
    }
    public void setMbiemer(String surname){
        this.mbiemer=surname;
    }
    public void setPaga_ore_pune(int paga){
        this.paga_ore_pune=paga;
    }
    public void setNr_OrePune(int nrore){
        this.nr_OrePune=nrore;
    }

    public void setID(String ID){
        this.ID=ID;
    }
    public String getEmer(){
        return emer;
    }
    public String getMbiemer(){
        return mbiemer;
    }
    public int getPaga_ore_pune(){
        return paga_ore_pune;
    }
    public int getNr_OrePune(){
        return  nr_OrePune;
    }
    public int rroga(){
        return nr_OrePune*paga_ore_pune;
    }
}
