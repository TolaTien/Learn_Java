package Generation;

import java.util.Arrays;
import java.util.Scanner;

public class DSA01022 {
    static boolean next_permutation(int[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }
        if(i < 0) return  false;
        int j = a.length - 1;
        while (a[j] <= a[i]) {
            j--;
        }
        swap(a, i, j);
        int l = i + 1;
        int r = a.length - 1;
        while (l < r) {
            swap(a, l, r);
            l++;
            r--;
        }
        return true;
    }

    static  void  swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static boolean check(int[] a, int[] b){
        return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            int[] brr = new int[N];
            int cnt = 1;
            for (int i =0; i < N; i++){
                arr[i] = i + 1;
                brr[i] = sc.nextInt();
            }

            while (true){
                if(check(arr, brr)){
                    System.out.println(cnt);
                    break;
                }
                cnt++;
                next_permutation(arr);
            }
        }
    }
}
