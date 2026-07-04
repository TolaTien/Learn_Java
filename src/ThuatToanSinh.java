import java.util.Scanner;

public class ThuatToanSinh {
    static  boolean next_binary(int[] a) {
        int i = a.length - 1;
        while (i >= 0 && a[i] == 1) {
            a[i] = 0;
            i--;
        }
        if(i < 0) return  false;
        a[i] = 1;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        while (true) {
            for(int x : arr) {
                System.out.print(x);
            }
            System.out.println();
            if(!next_binary(arr)) break;
        }
    }
}
