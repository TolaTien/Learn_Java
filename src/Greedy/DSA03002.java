package Greedy;

import java.util.Scanner;

public class DSA03002 {
    static int swap(String c, char a, char b){
        c = c.replace(a, b);
        return Integer.parseInt(c);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int min = swap(a, '6', '5') + swap(b, '6', '5');
        int max = swap(a, '5', '6') + swap(b, '5', '6');
        System.out.println(min + " " +max);
    }
}
