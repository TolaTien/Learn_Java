package Generation;

import java.util.*;

public class DSA01028 {
    static boolean next(int[] a, int n, int k) {
        int i = k - 1;
        while (i >= 0 && a[i] == n - k + i + 1) {
            i--;
        }
        if (i < 0) return false;
        a[i]++;
        for (int j = i + 1; j < k; j++) {
            a[j] = a[j - 1] + 1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.nextInt());
        }
        int m = set.size();
        int[] val = new int[m+1];
        int idx = 1;
        for (int x : set) {
            val[idx] = x;
            idx++;
        }
        int[] a = new int[K];
        for (int i = 0; i < K; i++) {
            a[i] = i + 1;
        }
        while (true) {
            for (int i = 0; i < K; i++) {
                System.out.print(val[a[i]] +  " " );
            }
            System.out.println();
            if (!next(a, m, K)) break;
        }
    }
}