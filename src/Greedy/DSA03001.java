package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class DSA03001 {

    public static void main(String[] args) {
        int[] nh = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
        Arrays.sort(nh);
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T --> 0){
            int N = sc.nextInt();
            int cnt = 0;
            for(int i = nh.length - 1; i >=0; i--){
                cnt += N / nh[i];
                N = N % nh[i];
            }
            System.out.println(cnt);
        }
    }
}
