package leksion2;

public class UshtrimSwitch {
    public static void main(String[]args) {
        int nota = 5;
        switch (nota) {
            case 10:
                System.out.println("Ekselent");
                break;
            case 9,8,7,6,5:
                System.out.println("Kalues");
                break;
            case 4:
                System.out.println("Ngeles");
                break;
            default:
                System.out.println("Note gabim.");
                break;
        }
    }
}
