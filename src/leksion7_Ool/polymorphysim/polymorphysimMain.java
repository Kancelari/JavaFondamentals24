package leksion7_Ool.polymorphysim;

//polimorphyism: each class can implement same interface and can have different overriden
//logic, also they can be declared by interface name and have initialization different
public class polymorphysimMain {
    public static void main(String[] args) {
        RemoteController r1=new AcRemoteController("Haier");
        RemoteController r2=new TvRemoteController("LG");
        r1.enable(true);
        r2.enable(false);
        //ne kete menyre behet type kasting
        TvRemoteController t2 = (TvRemoteController)r2;
        System.out.println("Tv type: "+ t2.getTvType());
        AcRemoteController a2=(AcRemoteController)r1;
        System.out.println("AC type: "+ a2.getAcType());
    }
}
