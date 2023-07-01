package ushtrime2Word;

import java.util.Scanner;

public class Klasa_Main {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        //Ushtrimi 1
        System.out.print("Jepni gjatesin e drejtkendorit: ");
        float x= input.nextFloat();
        System.out.print("Jepni gjeresine e drejtkendorit: ");
        float y= input.nextFloat();
        Area d1=new Area(x,y);
        System.out.println("Siperfaqja e drejtkendorit eshte: " + d1.returnArea(x,y));
        //Ushtrimi 2
        Film film1=new Film("Like Stars on Earth", "Star", "****");
        Film film2=new Film("Tetris", "Netflix", "*****");
        //if(film1.getReview())
        film1.MovieDescription();
        System.out.println("Vjetersia e ketij filmi eshte " + film1.vjetersia(2009) + " vite.");
        if(film1.getReview().length()<film2.getReview().length()){
            System.out.println("Filmi "+film2.getTitulli()+" ka me shume vlersim nga shikuesit.");
        }
        else{
            System.out.println("Filmi "+ film1.getTitulli()+" ka me shume vlersim nga shikuesit.");
        }



    }
}
