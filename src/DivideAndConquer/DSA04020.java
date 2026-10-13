package DivideAndConquer;

import java.util.Arrays;
import java.util.Scanner;

public class DSA04020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int idx = Arrays.binarySearch(a, k);
            if (idx >= 0) {
                System.out.println(idx + 1);
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}