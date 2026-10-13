package SortAndSearch;

import java.util.Arrays;
import java.util.Scanner;

public class DSA06001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int n = sc.nextInt();
            int[] A = new int[n];
            for(int i = 0; i < n; i++){
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);
            int l = 0;
            int r = n -1;
            while (l < r){
                System.out.print(A[r] + " ");
                System.out.print(A[l] + " ");
                l++;
                r--;
            }
            if(n % 2 != 0){
                System.out.print(A[n/2 ]);
            }
            System.out.println();
        }
    }
}
