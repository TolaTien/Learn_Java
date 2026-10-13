package SortAndSearch;

import java.util.Arrays;
import java.util.Scanner;

public class DSA06012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T --> 0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i < N; i++){
                arr[i] =sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i = N - 1; i >= 0; i--){
                if(K == 0) break;
                System.out.print(arr[i] +" ");
                K--;
            }
            System.out.println();
        }
    }
}
