package SortAndSearch;

import java.util.Arrays;
import java.util.Scanner;

public class DSA06015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int N = sc.nextInt();
            int[] a = new int[N];
            for(int i = 0; i < N; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            for(int x : a){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
