package SortAndSearch;

import java.util.Arrays;
import java.util.Scanner;

public class DSA06016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int m  = sc.nextInt();
            int n = sc.nextInt();
            int[] M = new int[m];
            int[] N = new int[n];
            for(int i = 0; i < m; i++){
                M[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                N[i] = sc.nextInt();
            }
            Arrays.sort(M);
            Arrays.sort(N);
            System.out.println((long)N[0] * M[M.length - 1]);
        }
    }
}
