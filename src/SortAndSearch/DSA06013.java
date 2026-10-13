package SortAndSearch;

import java.util.Scanner;

public class DSA06013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int cnt = 0;
            for (int i = 0; i < N; i++){
                if(X == sc.nextInt()) cnt++;
            }
            if(cnt > 0) System.out.println(cnt);
            else System.out.println(-1);
        }
    }
}
