package leksion2;
public class SwitchMakineLlogaritese {
    public static void main(String[]args){
        int vlera1=31;
        int vlera2=3;
        char veprim='/';
        double output;
        switch(veprim){
            case '*':{
                output=vlera1*vlera2;
                break;
            }
            case '/':{
                output=(double)vlera1/vlera2;
                break;
            }
            case '+':{
                output=vlera1+vlera2;
                break;
            }
            case '-':{
                output=vlera1-vlera2;
                break;
            }
            case '%':{
                output=vlera1%vlera2;
                break;
            }
            default:{
                output=0;
                System.out.println("Operator i gabuar");
            }
        }
        System.out.println(output);
    }
}
