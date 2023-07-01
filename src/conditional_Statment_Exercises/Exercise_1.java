package conditional_Statment_Exercises;

public class Exercise_1 {
    public static void main(String[]args){
        int result = (int) (Math.random() * 6 + 1);
        //will display whether the result is even or odd
        //if the result is 6, write additionally the word WON
        if (result%2==0) {
            if (result == 6) {
                System.out.println("EVEN number and WON");
            }
            else{
                System.out.println("EVEN number");
            }
        }
        else{
            System.out.println("ODD number");
        }
    }
}
