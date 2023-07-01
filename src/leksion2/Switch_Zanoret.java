package leksion2;

public class Switch_Zanoret {
    public static void main(String[]args){
        char karakteri='l';
        switch (karakteri){
            case 'a','e','y':{
                System.out.println("Karakteri qe shkruat eshte nje zanore");
                break;}
            case 'o':{
                System.out.println("Karakteri qe shkruat eshte nje zanore");
                System.out.println(karakteri);
                break;}
            case 'u':{
                System.out.println("Karakteri qe shkruat eshte nje zanore");
                System.out.println(karakteri);
                break;}
            case 'i':{
                System.out.println("Karakteri qe shkruat eshte nje zanore");
                System.out.println(karakteri);
                break;}
            default:{
                System.out.println("Karakteri qe shkruat eshte nje bashktingellore");
                System.out.println(karakteri);
                break;}
        }
    }
}
