package leksion7_Ool.composition;

public class CompositionMain {
    //komposition eshte kur brenda nje klase therrasim nje klase tjeter si atribut
    //encapsulation eshte kur nuk mund te aksesojme atributet nga jashte klases, per ti aksesuar duhet
    //te perdorim get dhe set
     static class Room{
        private Bed bed;
        private TV tv;

        public Bed getBed() {
            return bed;
        }

        public void setBed(Bed bed) {
            this.bed = bed;
        }

        public TV getTv() {
            return tv;
        }

        public void setTv(TV tv) {
            this.tv = tv;
        }
        public void showRoom(){
            System.out.printf("Room has TV: {type: %s , resolution: %d "+
                    "and Bed: {name: %s , bedroomSizePerMeterSqrt: %d\n", tv.type, tv.resolution, bed.name, bed.bedroomSizePerMeterSqrt );
        }
    }

    static class Bed{
        String name;
        int bedroomSizePerMeterSqrt;
    }
    static class TV{
        String type;
        int resolution;
    }
    public static void main(String[] args) {
        TV t1= new TV();
        t1.type ="LG";
        t1.resolution=120;
        Bed b1= new Bed();
        b1.name="sthBed";
        b1.bedroomSizePerMeterSqrt=2;
        Room r1= new Room();
        r1.setBed(b1);
        r1.setTv(t1);
        r1.showRoom();
    }
}
