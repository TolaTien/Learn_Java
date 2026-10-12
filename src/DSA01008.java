import java.util.Scanner;

public class DSA01008 {
    static boolean next(int[] a){
        int i = a.length - 1;
        while (i >= 0 && a[i] == 1){
            a[i] = 0;
            i--;
        }
        if(i < 0 ) return false;
        a[i] = 1;
        return true;
    }
    static boolean check(int[] a, int K){
        int cnt = 0;
        for(int x: a){
            if(x == 1) cnt++;
        }
        return K == cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            do {
                if (check(arr, K)) {
                    for (int x : arr) {
                        System.out.print(x);
                    }
                    System.out.println();
                }
            } while (next(arr));
        }
    }
}
