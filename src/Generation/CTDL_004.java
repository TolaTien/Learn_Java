package Generation;

import java.util.Scanner;

public class CTDL_004 {
    static int N, K;
    static int[] a, x;
    static int cnt = 0;
    static void Try(int i ){
        for(int j = (i == 0) ? 0 : x[i - 1] + 1; j <= N - K  + i ; j++ ){
            if(i == 0 || a[j] >  a[x[i - 1]]){
                x[i] = j;
                if(i == K - 1){
                    cnt++;
                }else {
                    Try(i+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        a = new int[N];
        x = new int[K];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        Try(0);
        System.out.println(cnt);
    }
}
