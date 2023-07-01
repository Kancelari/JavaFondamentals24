package ushtrime_Word;
public class Ushtrim5 {
    public static void main(String[]args){
        int [] arr=new int[]{8,6,9,7,8,2,3,2};
        for (int i = 0; i < arr.length; i++)
        {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
