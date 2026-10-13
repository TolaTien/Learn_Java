// Chưa xong
package Generation;

import java.util.Scanner;

public class DSA01015  {
    static  boolean next_binary(int[] a) {
        int i = a.length - 1;
        while (i >= 0 && a[i] == 9) {
            a[i] = 0;
            i--;
        }
        if(i < 0) return  false;
        a[i] = 9;
        return true;
    }
    static int to(int[] a){
        String s = "";
        for(int x : a){
            s += x;
        }
        return Integer.parseInt(s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            while (true) {
                if(to(arr) % n == 0){
                    for(int x : arr) {
                        System.out.print(x);
                    }
                    System.out.println();
                }
                if(!next_binary(arr)) break;
            }
        }
    }
}
