package DivideAndConquer;

import java.util.Scanner;

public class DSA04008 {
    static int N;
    static long MOD = 1000000000 + 7;
    static long Try(int i){
        if(i == 0) return 0;
        if(i == 1) return 1;
        return Try(i - 1) % MOD + Try(i - 2) % MOD;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            N = sc.nextInt();
            System.out.println(Try(N));
        }
    }
}
