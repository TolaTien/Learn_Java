package Generation;

import java.util.Scanner;

public class DSA_P002 {
    static boolean next_permutation(int[] a) {
        int i = a.length - 2;
        while (i >=0 && a[i] >= a[i+1]){
            i--;
        }
        if(i < 0 ) return  false;
        int j = a.length - 1;
        while (a[j] <= a[i]) {
            j--;
        }
        swap(a, i, j);
        int l = i + 1;
        int r = a.length - 1;
        while (r > l){
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
    static String printArray(int[] a){
        String s = "";
        for(int i = 0; i < a.length; i++){
            s += a[i] + " ";
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = i + 1;
        }
        System.out.println("1: " + printArray(arr));
        int j = 2;
        while (next_permutation(arr)){
            System.out.println(j + ": " + printArray(arr));
            j++;
        }
    }
}
