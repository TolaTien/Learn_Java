package Generation;

import java.util.Arrays;
import java.util.Scanner;

public class DSA02005 {
    static boolean next_permutation(char[] a) {
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

    static  void  swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            char[] s = sc.next().toCharArray();
            Arrays.sort(s);
            do {
                System.out.print(new String(s)  + " ");
            } while (next_permutation(s));
            System.out.println();
        }
    }
}
