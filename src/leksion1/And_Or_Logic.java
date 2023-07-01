package leksion1;

public class And_Or_Logic {
    public static void main(String[]args){
        boolean vleraA=false;
        boolean vleraB=true;
        boolean resultAND=false;
        boolean resultOR=false;

        //Realizon and logic ndermjet A DHE B
        resultAND=vleraA&&vleraB;
        System.out.println(resultAND);
        resultOR=vleraA||vleraB;
        System.out.println(resultOR);
        boolean notLogic=false;
        notLogic=!vleraA;
        System.out.println(notLogic);

    }
}
