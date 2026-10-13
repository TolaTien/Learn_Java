package Generation;

import java.util.Scanner;

public class DSA01002 {
    static boolean next(int[] a, int n, int k){
        int i = k -1;
        while (i >=0 && a[i] == n - k + i + 1){
            i--;
        }
        if(i < 0) return  false;
        a[i]++;
        for(int j = i + 1; j < k; j++){
            a[j] = a[j-1] + 1;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[k];
            for(int i = 0; i < k; i++){
                arr[i] = sc.nextInt();
            }
            if(next(arr, n, k)){
                for (int i = 0; i < k; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }else {
                for(int i = 1; i < k +1 ; i++){
                    System.out.print(i + " ");
                }
                System.out.println();
            }

        }
    }
}