package Generation;

import java.util.Scanner;

public class DSA01005 {
    static boolean next_permuation(int[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }
        if(i < 0) return  false;
        int j = a.length - 1;
        while (a[j] <= a[i]){
            j--;
        }
        swap(a, i, j);
        int l = i + 1;
        int r = a.length -1;
        while (l < r){
            swap(a, l, r);
            l++;
            r--;
        }
        return true;
    }

    static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static void printArray(int[] a) {
        String s = "";
        for(int x : a){
            s += x;
        }
        System.out.print(s + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int t = 0; t < n; t++){
                arr[t] = t + 1;
            }
            printArray(arr);
            while (next_permuation(arr)){
                printArray(arr);
            }
            System.out.println();
        }
    }
}
