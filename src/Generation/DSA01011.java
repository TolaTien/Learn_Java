package Generation;

import java.util.Scanner;
public class DSA01011 {
    static boolean nextPermutation(int[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
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
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    static String printA(int[] a){
        String s ="";
        for(int x : a){
            s+= x;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int stt = sc.nextInt();
            String s = sc.next();
            int[] a = new int[s.length()];
            for (int i = 0; i < s.length(); i++) {
                a[i] = s.charAt(i) - '0';
            }
            if (nextPermutation(a)) {
                System.out.println(stt + " " + printA(a));
            } else {
                System.out.println(stt + " BIGGEST");
            }
        }

        sc.close();
    }
}