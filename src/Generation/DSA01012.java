package Generation;

import java.util.Scanner;

public class DSA01012  {
    static  boolean next_binary(long[] a) {
        int i = a.length - 1;
        while (i >= 0 && a[i] == 1) {
            a[i] = 0;
            i--;
        }
        if(i < 0) return  false;
        a[i] = 1;
        return true;
    }
    static String printA(long[] a){
        String s ="";
        for(long x: a){
            s += x;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            while (true) {
                System.out.print(printA(arr) + " ");
                if(!next_binary(arr)) break;
            }
            System.out.println();
        }
    }
}
