package leksion7_Ool.exceptions;
import leksion7_Ool.enumExample.CustomErrorAnnotation;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
/*
Exception jane klasa qe kan bere extend throwable abstract class
Each exception also has extended Exception class so each exception is subclass of expetion
exception handling has 3 blocks try, catch (always after try and exeption should be defined as parameter
and finally block that is always in any condition error or no error occurring
 */
public class ExeptionMain {
    static class CustomException extends  Exception{
        private String solution;
        public CustomException(String message, String solution) {
            super(message);
            this.solution = solution;
        }
        public String getSolution() {
            return solution;
        }
    }
    public static void useExceptionHandling() {
        int a;
        int b;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a: ");
            a = input.nextInt();
            System.out.print("Enter b: ");
            b = input.nextInt();
            try {
                int c = a / b;
                System.out.println("c value is: " + c);
            } catch (ArithmeticException e) {
                System.out.println("Devision by 0 is impossible");
            }
            int d = a * b;
            System.out.println("d value is: " + d);
        } catch (InputMismatchException e) {
            System.out.println("Duhet te vendosni numrer ne kete variablel");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Ky eshte nje perjashtim per IndexOutOfBoundsException");
        }finally {
            a=10;
            b=4;
            System.out.printf("By default value of a = %d and b = %d\n", a, b);
        }
    }
    public static void useExceptionHandling2(){
        int a;
        int b;
        Scanner input=new Scanner(System.in);
        while(true){
            try{
                System.out.print("Enter a: ");
                a = input.nextInt();
                System.out.print("Enter b: ");
                b = input.nextInt();
                if(b==0){
                    System.out.println("Devision by 0 is impossible");
                    continue;
                }
                int c = a / b;
                System.out.println("c value is: " + c);
                int d =a*b;
                System.out.println("d value is: " + d);
                break;
            }catch (Exception e){
                System.out.println();
                System.out.println("Error message: ");
                System.out.println("Try again");
                input.next();
            }
        }
    }

    //Mund te krijojme vete nje exception ne kete menyre duke krijuar kete metoden meposhte.
    public static void exceptionThrowing() throws Exception {
        int a,b ;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = input.nextInt();
        System.out.print("Enter b: ");
        b = input.nextInt();
        if(b==0){
//            throw new Exception("value b can not be 0");
            throw new CustomException("value b can not be 0", "just make value b different form 0");
//            throw new NoSuchElementException();
        }
    }
    public static void main(String[] args) {
      //  useExceptionHandling();
     //   useExceptionHandling2();
     try{
         exceptionThrowing();
     }catch(Exception e){
         CustomException e1= (CustomException) e;
         System.out.println(e1.getMessage());
         System.out.println(e1.getSolution());
     }
    }
}
