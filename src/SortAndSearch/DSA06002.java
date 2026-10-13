package SortAndSearch;

import java.util.Arrays;
import java.util.Scanner;

public class DSA06002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int n = sc.nextInt();
            int X = sc.nextInt();
            Integer[] a = new Integer[n];
            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, (x, y) -> Math.abs(x - X) - Math.abs(y - X));
            for(int x : a){
                System.out.print(x +  " ");
            } System.out.println();
        }
    }
}
