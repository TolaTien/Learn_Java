package Generation;

import java.util.Scanner;

public class DSA01003 {
    static boolean next(int[] a){
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]){
            i--;
        }
        if(i < 0) return false;
        int j = a.length - 1;
        while (a[j] <= a[i]) {
            j--;
        }
        swap(a, i , j);
        int r = a.length - 1;
        int l = i + 1;
        while (l < r) {
            swap(a, l, r);
            l++;
            r--;
        }
        return true;
    }

    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int N = sc.nextInt();
            int[] X = new int[N];
            for(int j = 0; j < N; j++) {
                X[j] = sc.nextInt();
            }
            while (next(X)){
                for(int x : X){
                    System.out.print(x + " ");
                }
                System.out.println();
                break;
            }
            if(!next(X)){
                int l = 0;
                int r = X.length - 1;
                while (l < r) {
                    swap(X, l, r);
                    l++;
                    r--;
                }
                for(int x : X){
                    System.out.print(x + " ");
                }
                System.out.println();
            }
        }

    }

}
