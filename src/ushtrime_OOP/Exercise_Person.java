package ushtrime_OOP;
import java.util.Scanner;
public class Exercise_Person {
    static int ageDiff(int age1, int age2){
        int diff=age1-age2;
        if (diff<0){
            diff=diff*-1;
        }
        return diff;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Person p1 = new Person();
        p1.name="Afrim";
        p1.setAge(70);
        p1.setGender("Male");
        System.out.println(p1.name);
        Person p2=new Person();
        p2.name="Artan";
        p2.age=43;
        System.out.println("Difference between "+ p1.name+ " and "+ p2.name);
        System.out.println("The difference between you is "+ ageDiff(p1.age, p2.age)+" years.");
        System.out.println("Your age is " +p1.age +" need to wait also "+ p1.returnDiff(p1.age)+ " years");
    }
}
