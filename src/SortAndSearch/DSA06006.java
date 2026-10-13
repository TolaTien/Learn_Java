package SortAndSearch;

import java.util.Arrays;
import java.util.Scanner;

public class DSA06006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            for(int x : arr){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
