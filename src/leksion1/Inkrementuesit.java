package leksion1;

public class Inkrementuesit {
    public static void main(String[]args){
        int x=7;
        System.out.println(x);
        x--;
        System.out.println(x);
        x--;
        System.out.println(x);
        System.out.println(--x);

        int y=3;
        y+=x;
        --y;
        y++;
        System.out.println(y++);
        System.out.println(y);
        float z=6.3f;
        z++; //7.3
        z++; //8.3
        ++z; //9.3
        System.out.println(z);//9.3
        System.out.println(z--); //9.3
        System.out.println(--z); //7.3
    }
}
