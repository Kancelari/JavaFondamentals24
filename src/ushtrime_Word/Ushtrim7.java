package ushtrime_Word;

public class Ushtrim7 {
    public static void main(String[] args) {
        int[] num = new int[]{50, -20, 0, 30, 40, 60, 10};
        if (num[0] == num[num.length - 1]) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
