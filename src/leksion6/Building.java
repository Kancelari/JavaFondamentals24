package leksion6;

public class Building {
    private String tipiPrones;
    private float Sip;
    private float CmimiPerM2;
    private boolean Sconto;
    private int VleraSconto;
    public Building(){    }
    public Building(String tipiPrones, float Sip){
        this.tipiPrones=tipiPrones;
        this.Sip=Sip;
    }
    public Building(String tipiPrones, float Sip, boolean Sconto, float CmimiM2, int VleraSconto){
        this.tipiPrones=tipiPrones;
        this.Sip=Sip;
        this.CmimiPerM2=CmimiM2;
        this.Sconto=Sconto;
        this.VleraSconto=VleraSconto;
    }

    public String getTipiPrones() {
        return tipiPrones;
    }

    public float getSip() {
        return Sip;
    }

    public float getCmimiPerM2() {
        return CmimiPerM2;
    }

    public boolean getSconto() {
        return Sconto;
    }

    public int getVleraSconto() {
        return VleraSconto;
    }

    public void setTipiPrones(String tipiPrones) {
        this.tipiPrones = tipiPrones;
    }

    public void setSip(float sip) {
        Sip = sip;
    }

    public void setCmimiPerM2(float cmimiPerM2) {
        CmimiPerM2 = cmimiPerM2;
    }

    public void setSconto(boolean sconto) {
        Sconto = sconto;
    }

    public void setVleraSconto(int vleraSconto) {
        VleraSconto = vleraSconto;
    }

    public void printoTeDhenat(){
        System.out.println("Tipi i prones eshte "+ tipiPrones +
                        " siperfaqja e saj eshte " + Sip +
                        " cmimi per meter katror eshte " + CmimiPerM2
                );
    }
    public float cmimiShitjes(boolean Sconto){
        float cmimi;
        if(Sconto==true){
            cmimi= (float) ((Sip*CmimiPerM2)-((Sip*CmimiPerM2)*(getVleraSconto()/100.0)));
        }
        else{
            cmimi=Sip*CmimiPerM2;
        }
        return cmimi;
    }
}
