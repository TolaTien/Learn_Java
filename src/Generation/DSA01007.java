package Generation;

import java.util.Scanner;

public class DSA01007 {
    static  int n;
    static char[] x;
    static void Try(int i){
        for(char j = 'A'; j <= 'B'; j++){
            x[i] = j;
            if(i == n -  1){
                boolean check = false;
                for(char t : x){
                    System.out.print(t);
                }
                System.out.print(" ");
            }else {
                Try(i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T --> 0){
            n = sc.nextInt();
            x = new char[n];
            Try(0);
            System.out.println();
        }
    }
}
