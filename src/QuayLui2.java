import java.util.Scanner;

public class QuayLui2 {
    static int n;
    static int[] X;
    static boolean[] check;
    static void printA(){
        for(int x : X ){
            System.out.print(x);
        }
        System.out.println();
    }
    static void Try(int i){
        for(int j = 1; j <= n; j++){
            if( check[j]){
                X[i] = j;
                check[j] = false;
                if(i == n - 1) printA();
                else Try(i+1);
                check[j] = true;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        X = new int[n];
        check = new boolean[n + 1 ];
        for(int i = 1; i <= n; i++){
            check[i] = true;
        }
        Try(0);
    }
}
