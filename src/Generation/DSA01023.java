package Generation;

import java.util.Arrays;
import java.util.Scanner;

public class DSA01023 {
    static boolean next(int[] a, int n, int k){
        int i = k - 1;
        while (i >= 0 && a[i] == n - k + i + 1 ) {
            i--;
        }

        if(i < 0) return false;
        a[i]++;
        for(int j = i + 1; j < k; j++) {
            a[j] = a[j-1] + 1;
        }
        return true;
    }
    static boolean check(int[] a, int[] b){
        return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[K];
            int[] brr = new int[K];
            int cnt = 1;
            for (int i =0; i < K; i++){
                arr[i] = i + 1;
                brr[i] = sc.nextInt();
            }

            while (true){
                if(check(arr, brr)){
                    System.out.println(cnt);
                    break;
                }
                cnt++;
                next(arr, N, K);
            }
        }
    }
}
