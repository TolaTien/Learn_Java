package Generation;

import java.util.Scanner;

public class CTDL_002 {
    static int N,K;
    static int[] n;
    static int[] k;
    static int cnt = 0;
    static void Try(int i){
        for(int j  = 0; j <= 1; j++){
            k[i] = j;
            if(i == N - 1){
                check();
            }else {
                Try(i+1);
            }
        }
    }
    static void check(){
        int sum = 0;
        for(int i = 0; i < N; i++){
            if(k[i] == 1) sum+= n[i];
        }
        if(sum == K){
            cnt++;
            for(int i = 0; i < N; i++){
                if(k[i] == 1) {
                    System.out.print(n[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        n = new int[N];
        k = new int[N];
        for(int i = 0; i < N; i++ ){
            n[i] = sc.nextInt();
        }
        Try(0);
        System.out.println(cnt);
    }
}
