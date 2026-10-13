package Generation;

import java.util.Arrays;
import java.util.Scanner;

public class DSA01027 {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        while (true){
            for(int x: arr){
                System.out.print(x +" ");
            }
            System.out.println();
            if(!next_permutation(arr)) break;
        }
    }
}
