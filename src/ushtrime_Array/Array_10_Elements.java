package ushtrime_Array;

public class Array_10_Elements {
    public static void main(String[]args){
        int[] integers = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};
        //all numbers
        int shuma=0;
        System.out.print("All numbers: ");
        for (int i=0; i<integers.length; i++){
            System.out.print(integers[i]+", ");
        }
        //first 6 numbers
        System.out.println();
        System.out.print("First 6 numbers: ");
        for (int i=0; i<6; i++){
            System.out.print(integers[i]+" ");
        }
        System.out.println();
        System.out.print("Last 6 numbers: ");
        //last 6 numbers
        for (int i=4;i<=9;i++){
            System.out.print(integers[i]+" ");
        }
        //all even numbers
        System.out.println();
        System.out.print("All even numbers: ");
        for (int i=0; i<integers.length; i++) {
            if (integers[i] % 2 == 0) {
                System.out.print(integers[i] + " ");
            }
        }
        //all digits at odd indexes
        System.out.println();
        System.out.print("All digits at odd indexes: ");
        for (int i=0; i<integers.length;i++){
            if(i%2!=0){
                System.out.print(integers[i]+ " ");
            }
        }
        //all numbers backwards
        System.out.println();
        System.out.print("All numbers backwards: ");
        for(int i=9; i>=0;i--){
            System.out.print(integers[i] + " ");
        }
        //all numbers except 5
        System.out.println();
        System.out.print("All numbers except 5: ");
        for (int i=0; i<integers.length; i++){
            if(integers[i]==5){
                continue;
            }
            else{
                System.out.print(integers[i]+" ");
            }
        }
        //all digits up to and including 7
        System.out.println();
        System.out.print("All digits up to and including 7: ");
        for (int i=0; i<integers.length; i++){
            if (integers[i]>=7){
                System.out.print(integers[i]+ " ");
            }
        }
        //all digits divisible by 3
        System.out.println();
        System.out.print("All digits divisible by 3: ");
        for (int i=0; i<integers.length; i++){
            if(integers[i]%3==0){
                System.out.print(integers[i] + " ");
            }
        }
        //sum of all digits
        System.out.println();
        System.out.print("Sum of all digits is: ");
        for (int i=0; i<integers.length; i++){
            shuma=shuma+integers[i];
        }
        System.out.print(shuma);
        //sum of all digits greater or equal 4
        System.out.println();
        shuma=0;
        System.out.print("Sum of all digits greater or equal 4 is: ");
        for (int i=0; i<integers.length; i++) {
            if (integers[i] >= 4) {
                shuma = shuma + integers[i];
            }
        }
        System.out.print(shuma);
        //the smallest and largest digit
        System.out.println();
        System.out.print("The smallest and largest digit: ");
        int max=integers[0];
        int min=integers[0];
        for (int i=1;i<integers.length;i++){
            max=(integers[i]>max ? integers[i] : max);
            min=(integers[i]<min ? integers[i] : min);
        }
        System.out.print(" Max is: " + max + " Min is: " + min);
    }
}
