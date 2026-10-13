package SortAndSearch;

import java.util.*;

public class DSA06004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            TreeSet<Integer> setA = new TreeSet<>();
            TreeSet<Integer> hop = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                setA.add(x);
                hop.add(x);
            }
            TreeSet<Integer> giao = new TreeSet<>();
            for (int i = 0; i < m; i++) {
                int x = sc.nextInt();
                hop.add(x);
                if (setA.contains(x)) {
                    giao.add(x);
                }
            }
            for (int x : hop) {
                System.out.print(x + " ");
            }
            System.out.println();
            for (int x : giao) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}