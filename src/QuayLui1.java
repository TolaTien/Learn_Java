import java.util.Scanner;

public class QuayLui1 {
    static int n;
    static int k;
    static int[] X;
    static void printA(int[] a){
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
    static void Try(int i){
        for(int j = (i == 0) ? 1 :  X[i - 1] + 1; j <= n - k + i + 1; j++){
            X[i] = j;
            if(i == k - 1) printA(X);
            else Try(i+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        X = new int[k];
        Try(0);

    }
}
