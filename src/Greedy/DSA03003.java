package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class DSA03003 {
    static long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int N = sc.nextInt();
            long[] arr = new long[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            long sum = 0;
            for(int j = 0; j < N; j++){
                sum += (j * arr[j]) % MOD;
            }
            System.out.println(sum % MOD);
        }
    }
}
